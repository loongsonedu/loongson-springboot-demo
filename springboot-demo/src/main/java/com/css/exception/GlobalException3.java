package com.css.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

//通过实现HandlerExceptionResolver全局处理异常,统一一个处理方法,同时还能显示异常信息到页面
//@Configuration
public class GlobalException3 implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView mv = new ModelAndView();

        if (ex instanceof ArithmeticException) {
            mv.setViewName("error1");
        } else if (ex instanceof NullPointerException) {
            mv.setViewName("error2");
        }

        mv.addObject("error", ex.toString());

        return mv;
    }

}
