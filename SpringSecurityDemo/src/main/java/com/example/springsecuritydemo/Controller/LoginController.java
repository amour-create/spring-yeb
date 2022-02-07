package com.example.springsecuritydemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("login")
    public String Login(){
        System.out.println("执行登录方法");
        return "redirect:login.html";
    }
}
