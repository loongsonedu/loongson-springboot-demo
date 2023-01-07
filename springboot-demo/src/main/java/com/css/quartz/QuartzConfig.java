package com.css.quartz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;

@Configuration
public class QuartzConfig {

    /**
     * 创建自定义的执行任务
     *@name    中文名称
     *@description 相关说明
     *@time    创建时间:2019年3月18日下午5:06:21
     *@return
     *@author   朱昭明
     *@history 修订历史（历次修订内容、修订人、修订时间等）
     */
    @Bean
    public JobDetailFactoryBean jobDetailFactoryBean() {
        JobDetailFactoryBean jobFactory = new JobDetailFactoryBean();
        //关联 自定义job类 
        jobFactory.setJobClass(JobTask.class);
        return jobFactory;
    }

    /**
     * 创建trigger(简单trigger对象)
     *@name    中文名称
     *@description 相关说明
     *@time    创建时间:2019年3月18日下午5:12:57
     *@param jobDetailFactoryBean
     *@return
     *@author   朱昭明
     *@history 修订历史（历次修订内容、修订人、修订时间等）
     */
    /*@Bean
    public SimpleTriggerFactoryBean simpleTriggerFactoryBean(JobDetailFactoryBean jobDetailFactoryBean) {
        SimpleTriggerFactoryBean simpleFactory = new SimpleTriggerFactoryBean();
        //关联JobDetail对象
        simpleFactory.setJobDetail(jobDetailFactoryBean.getObject());
        //设置 间隔时间
        simpleFactory.setRepeatInterval(1000);
        //执行次数
        simpleFactory.setRepeatCount(100);
        return simpleFactory;
    }*/
    
    /**
     * 创建Trigger对象(Cron Trigger )
     *@name    中文名称
     *@description 相关说明
     *@time    创建时间:2019年3月18日下午5:23:18
     *@param jobDetailFactoryBean
     *@return
     *@author   朱昭明
     *@history 修订历史（历次修订内容、修订人、修订时间等）
     */
    @Bean
    public CronTriggerFactoryBean cronTriggerFactoryBean(JobDetailFactoryBean jobDetailFactoryBean){
        CronTriggerFactoryBean  cronFactory = new CronTriggerFactoryBean();
        cronFactory.setJobDetail(jobDetailFactoryBean.getObject());
        cronFactory.setCronExpression("0/5 * 1 * * ?");
        
        return cronFactory;
    }
    
    

    /**
     *创建scheduler对象
     *@name    中文名称
     *@description 相关说明
     *@time    创建时间:2019年3月18日下午5:13:39
     *@param simpleTriggerFactoryBean
     *@return
     *@author   朱昭明
     *@history 修订历史（历次修订内容、修订人、修订时间等）
     */
    /* @Bean
     public SchedulerFactoryBean schedulerFactoryBean(CronTriggerFactoryBean cronTriggerFactoryBean) {
         SchedulerFactoryBean schedulerFactory = new SchedulerFactoryBean();
         //关联 trigger对象
         schedulerFactory.setTriggers(cronTriggerFactoryBean.getObject());
         return schedulerFactory;
     }*/
    
    /**
     * 指定自定义的jobfactory工厂
     *@name    中文名称
     *@description 相关说明
     *@time    创建时间:2019年3月22日下午2:41:15
     *@param cronTriggerFactoryBean
     *@param myAdaptableJobFactory
     *@return
     *@author   朱昭明
     *@history 修订历史（历次修订内容、修订人、修订时间等）
     */
    @Bean
    public SchedulerFactoryBean schedulerFactoryBean(CronTriggerFactoryBean cronTriggerFactoryBean,MyAdaptableJobFactory myAdaptableJobFactory) {
        SchedulerFactoryBean schedulerFactory = new SchedulerFactoryBean();
        //关联 trigger对象
        schedulerFactory.setTriggers(cronTriggerFactoryBean.getObject());
        schedulerFactory.setJobFactory(myAdaptableJobFactory);
        return schedulerFactory;
    }
}
