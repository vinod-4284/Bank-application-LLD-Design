package com.project.vinodSB;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApihello {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }

    // user class call
    @GetMapping("/user")
    public User sayUser() {
        User user= new User(1,"vinod", "vinod@4284gmail.com");
        return user;
    }
}
