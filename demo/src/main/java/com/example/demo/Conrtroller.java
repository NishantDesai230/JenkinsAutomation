package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Conrtroller {

    @GetMapping("/hello/{name}")
    public String displayName(@PathVariable String name){
        return "hello "+ name;
    }

}
