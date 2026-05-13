package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello from Java CI/CD!";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
