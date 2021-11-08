package com.wtu.service;

import com.wtu.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    //登录
    User login(Map<String,Object> map);
    //查询所有
    List<User> allUsers();
    /*//添加用户
    void  addUsers();*/

}
