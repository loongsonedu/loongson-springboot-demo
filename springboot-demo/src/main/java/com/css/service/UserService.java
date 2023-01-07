package com.css.service;

import java.sql.SQLException;
import java.util.List;

import com.css.pojo.User;

public interface UserService {
    void addUser(User user);
    
    List<User> selectUserList();
    
    User selectUserById(Integer id);
    
    void editUser(User user) throws SQLException;
    
    void deleteUser(Integer id);
    
    void jobTask();
}
