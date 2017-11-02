package com.blog.model.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.blog.model.entity.User;
import com.blog.model.mapper.UserMapper;

@Service
public class UserService {
    @Resource
    UserMapper mapper;

    public User getUserByName() {
        return mapper.getUserByName("admin");
    }
}
