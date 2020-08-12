package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: Soul
 * Date: 2020/8/12
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }

}
