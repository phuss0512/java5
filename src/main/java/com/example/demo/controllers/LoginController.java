package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @GetMapping("login")
    public String getLoginForm(){
        return "login";
    }

//    @PostMapping("login")
//    public String login(@RequestParam("username") String usr,
//                        @RequestParam("password") String prd){
//
//        System.out.println("username: "+ usr);
//        System.out.println("password: "+ prd);
//        return "login";
//    }

    @PostMapping("login")
    public String login(
            @RequestParam("username") String user,
            @RequestParam("password") String pwd,
            Model model
    ) {
        System.out.println(user);
        System.out.println(pwd);
        model.addAttribute("name", user);
        return "login";
    }
}

