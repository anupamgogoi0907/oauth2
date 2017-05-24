package com.anupam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @GetMapping("/basic_protected")
    @ResponseBody
    public String getAuth() {
        return "I am secured by Http Basic authentication.";
    }

    @GetMapping("/oauth_protected")
    @ResponseBody
    public String getOauth() {
        return "I am secured by Oauth.";
    }

    @GetMapping("/callback")
    @ResponseBody
    public String callBack() {
        return "Success";
    }


}