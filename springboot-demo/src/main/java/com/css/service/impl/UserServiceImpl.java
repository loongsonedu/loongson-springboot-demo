package com.css.service.impl;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.css.mapper.UserMapper;
import com.css.pojo.User;
import com.css.pojo.UserExample;
import com.css.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public void addUser(User user) {
        logger.info(UserServiceImpl.class.getName()+" 添加用户：" + user.toString());
        userMapper.insertSelective(user);
    }

    @Override
    public List<User> selectUserList() {
        UserExample example = new UserExample();
        return userMapper.selectByExample(example);
    }

    @Override
    public User selectUserById(Integer id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    @Override
    public void editUser(User user) throws SQLException {
        logger.info(UserServiceImpl.class.getName()+" 修改用户：" + user);
        userMapper.updateByPrimaryKeySelective(user);
        //int i=1/0;
//        throw new SQLException("sql exception");
    }

    @Override
    public void deleteUser(Integer id) {
        logger.info(UserServiceImpl.class.getName()+" 刪除用户：" +id );
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void jobTask() {
        System.out.println(LocalDateTime.now() + " quartz job 执行111。。。");
    }
}
