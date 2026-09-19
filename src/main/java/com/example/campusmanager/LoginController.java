package com.example.campusmanager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @GetMapping("/login")
    public String login(@RequestParam String username,@RequestParam String password)
    {
        String name="ag";
        String word="123456";
        if(username.equals(name)&&password.equals(word))
        {
            return "密码正确";
        }
        else{
            return "密码错误";
        }
    }
}
