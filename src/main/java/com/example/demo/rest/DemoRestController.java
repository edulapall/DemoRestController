package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class DemoRestController {
    @GetMapping(value = "/hello")
    public String hello(){
        return "hello";
    }


}
