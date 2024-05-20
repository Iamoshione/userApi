package com.practice.api.practiceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PracticeApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeApiApplication.class, args);
    }

}
