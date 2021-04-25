package com.example.demo.service;

import com.example.demo.model.Demo;
import org.springframework.stereotype.Component;

@Component
public class DemoService {

    public Demo getDemoData() {
        Demo demo = new Demo();
        demo.setName("Priya");
        return demo;
    }
}
