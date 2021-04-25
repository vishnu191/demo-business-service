package com.example.demo.controller;

import com.example.demo.model.Demo;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DemoServiceController {

    @Autowired
    DemoService demoService;

    @GetMapping("hello-world")
    @ResponseBody
    public Demo demoHelloWorld(){
       Demo demo= demoService.getDemoData();
    return demo;
    }

}
