package com.springdemo.hello_javaee;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping
    public String helloWorld(){
        return "Hello World from Spring Boot";

    }
    @RequestMapping("/goodbye")
    public String goobye(){
        return "Goodbye from Spring Boot";
    }

}
