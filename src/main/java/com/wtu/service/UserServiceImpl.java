package com.wtu.service;

import com.wtu.entity.User;
import com.wtu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(Map<String, Object> map) {
        return userMapper.login(map);
    }

    @Override
    public List<User> allUsers() {
        return userMapper.allUsers();
    }


}
