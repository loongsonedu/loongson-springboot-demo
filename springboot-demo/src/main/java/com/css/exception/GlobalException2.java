package com.css.exception;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

//全局异常处理,只需要一个方法返回SimpleMappingExceptionResolver就能处理所有异常,但是不能返回详细异常信息到页面
//@Configuration
public class GlobalException2 {
    @Bean
    public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver() {
        SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
        Properties pro = new Properties();
        pro.put("java.lang.ArithmeticException", "error1");
        pro.put("java.lang.NullPointerException", "error2");
        resolver.setExceptionMappings(pro);
        return resolver;
    }
}
