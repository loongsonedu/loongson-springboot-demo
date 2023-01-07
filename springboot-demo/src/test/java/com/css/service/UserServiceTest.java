package com.css.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.css.SpringbootDemoApplication;
import com.css.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={SpringbootDemoApplication.class})
public class UserServiceTest {

    @Autowired
    UserService userService;
    
    @Test
    public void addTest(){
    	//新增
        User user = new User();
        user.setName("haha");
        user.setAge(20);
        userService.addUser(user);
        //查询
        List<User> list = userService.selectUserList();
        if(list!=null&&list.size()>0) {
        	for(User user1: list) {
        		System.out.println(user1);
        		
        	}
        }
    }
}
