package com.css.controller;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.css.pojo.User;
import com.css.service.UserService;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page, User user) {
        return page;
    }

    @RequestMapping("/user/addUser")
    public String add(@Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            return "add";
        }

        userService.addUser(user);
        return "redirect:/user/selectUser";
    }

    @RequestMapping("/user/selectUser")
    public String select(Model model) {
        List<User> userList = userService.selectUserList();
        model.addAttribute("userList", userList);

        return "list";
    }

    @RequestMapping("/user/to/edit")
    public String toEdit(Integer id, Model model) {
        User user = userService.selectUserById(id);
        model.addAttribute("user", user);
        return "edit";
    }

    @RequestMapping("/user/editUser")
    public String edit(@Valid User user,BindingResult result) throws SQLException {
        if(result.hasErrors())
        {
            return "edit";
        }
        userService.editUser(user);
        return "redirect:/user/selectUser";
    }
    @RequestMapping("/user/deleteUser")
    public String delete(@Valid Integer id) throws SQLException {
        userService.deleteUser(id);
        return "redirect:/user/selectUser";
    }
}
