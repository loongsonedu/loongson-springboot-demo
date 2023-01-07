package com.css.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExceptionController {

    @RequestMapping("/show1")
    public String show1() {
        System.out.println(10 / 0);
        return "success";
    }

    @RequestMapping("/show2")
    public String show2() {
        String str = null;
        System.out.println(str.length());
        return "success";
    }
}
