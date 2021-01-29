package com.even.wj.controller;

import com.even.wj.pojo.User;
import com.even.wj.result.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import java.util.Objects;

@RestController
public class LoginController {
    @CrossOrigin
    @PostMapping(value = "/api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser){
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);
        if(!Objects.equals("admin",username)||!Objects.equals("123456",requestUser.getPassword())){
            String massage = "账号或密码错误!";
            System.out.println(massage);
            return new Result(400);
        }else{
            return new Result(200);
        }
    }
}
