package me.trinityfforce.cicdtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CicdTestApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
