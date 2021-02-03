package com.even.wj.controller;

import com.even.wj.pojo.User;
import com.even.wj.result.Result;
import com.even.wj.service.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import java.util.Objects;

@RestController
@CrossOrigin(origins = "http://localhost:8443")
public class LoginController {

    @Autowired
    private UserService userService;


    @PostMapping(value = "/api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser){
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);
        User user = userService.get(username,requestUser.getPassword());
        if(user==null){
            String massage = "账号或密码错误!";
            System.out.println(massage);
            return new Result(400);
        }else{
            return new Result(200);
        }
    }
}
