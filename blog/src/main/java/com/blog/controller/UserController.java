package com.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.model.base.Result;
import com.blog.model.entity.User;
import com.blog.model.service.UserService;

import io.swagger.annotations.Api;



@RestController
@Api("用户类")
public class UserController {
    @Autowired
    UserService userService;
   public UserController() {
      System.out.println(111);
    }
   @ApiOperation
    @RequestMapping("/home")
    public Result<User> home() {
        ;
        return Result.success(userService.getUserByName());

    }
    

}
