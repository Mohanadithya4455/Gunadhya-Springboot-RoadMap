package com.example.springboot1;


import org.springframework.web.bind.annotation.*;

@RestController
public class Sample {
    @GetMapping()
    public String getHello(){
        return "hello world";
    }

    @GetMapping("/{name}")
    public String getName(@PathVariable("name") String name){
        return "hello "+name;
    }
}
