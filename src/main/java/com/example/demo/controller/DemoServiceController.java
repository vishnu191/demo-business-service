package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DemoServiceController {

    @GetMapping("hello-world")
    @ResponseBody
    public String demoHelloWorld(){
    return "Hello World!";
    }

}
