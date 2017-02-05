package com.anupam.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by brisatc186.gogoi on 24/08/2016.
 */

@RestController
@RequestMapping("/")
public class MyController
{
    @RequestMapping("/hello")
    public
    @ResponseBody
    String sayHello()
    {
        return "Hello";
    }

    @RequestMapping("/ping")
    public String ping()
    {
        return "Secured ping";
    }
}
