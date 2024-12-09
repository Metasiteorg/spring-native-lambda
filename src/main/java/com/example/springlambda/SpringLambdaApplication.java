package com.example.springlambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class SpringLambdaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringLambdaApplication.class, args);
    }

}
