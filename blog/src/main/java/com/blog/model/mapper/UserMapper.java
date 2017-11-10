package com.blog.model.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.blog.model.entity.User;

@Mapper
public interface UserMapper {
    User getUserByName(@Param("username") String username);

}
