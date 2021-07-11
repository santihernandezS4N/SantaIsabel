package com.example.restaurante;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class RestauranteApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestauranteApplication.class, args);
    }
    @GetMapping("/")
    public String hello() {
        return "working";
    }

}
