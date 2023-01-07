package com.css.config;

import java.util.Collections;

import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.interceptor.NameMatchTransactionAttributeSource;
import org.springframework.transaction.interceptor.RollbackRuleAttribute;
import org.springframework.transaction.interceptor.RuleBasedTransactionAttribute;
import org.springframework.transaction.interceptor.TransactionInterceptor;

@Configuration
public class TransactionConfig {
    @Autowired
    private DataSourceTransactionManager dataSourceTransactionManager;
    
    @Bean(name = "getTxAdvice")
    public TransactionInterceptor getTxAdvice() {
        RuleBasedTransactionAttribute txAttr_required = new RuleBasedTransactionAttribute();
        txAttr_required.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        //指定事务回滚异常类型
        txAttr_required.setRollbackRules(Collections.singletonList(new RollbackRuleAttribute(Exception.class)));

        RuleBasedTransactionAttribute txAttr_readonly = new RuleBasedTransactionAttribute();
        txAttr_readonly.setPropagationBehavior(TransactionDefinition.PROPAGATION_NOT_SUPPORTED);
        txAttr_readonly.setReadOnly(true);

        NameMatchTransactionAttributeSource source = new NameMatchTransactionAttributeSource();
        source.addTransactionalMethod("add*", txAttr_required);
        source.addTransactionalMethod("delete*", txAttr_required);
        source.addTransactionalMethod("edit*", txAttr_required);
        source.addTransactionalMethod("update", txAttr_required);
        source.addTransactionalMethod("select*", txAttr_readonly);
        source.addTransactionalMethod("find*", txAttr_readonly);

        TransactionInterceptor interceptor = new TransactionInterceptor(dataSourceTransactionManager, source);

        return interceptor;
    }

    @Bean
    public Advisor txAdviceAdvisor() {
        //声明切点（所有需要切入逻辑的连接点集合）
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        //设置需要拦截的方法
        pointcut.setExpression("execution (* com.css.service..*.*(..))");
        //返回aop配置器：切点+通知TxAdvice
        return new DefaultPointcutAdvisor(pointcut, getTxAdvice());
    }
}
