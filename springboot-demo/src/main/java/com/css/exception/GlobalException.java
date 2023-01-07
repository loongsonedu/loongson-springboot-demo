package com.css.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

//全局异常处理类,为每种异常创建一个处理方法
@ControllerAdvice 
public class GlobalException {
    //返回到指定异常页面
    //java.lang.ArithmeticException
    @ExceptionHandler(value = { ArithmeticException.class })
    public ModelAndView arithmeticExceptionHanlder(Exception ex) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("error", ex.toString());
        mv.setViewName("error1");
        return mv;
    }

    //返回json格式的数据
    //java.lang.NullPointerExceptiont
    @ExceptionHandler(value = { NullPointerException.class })
    @ResponseBody
    public Map<String,Object> nullPointerException(Exception ex) {
       Map<String, Object> errorMap = new HashMap<String,Object>();
       errorMap.put("code", 500);
       errorMap.put("msg", ex.toString());
        return errorMap;
    }
}
