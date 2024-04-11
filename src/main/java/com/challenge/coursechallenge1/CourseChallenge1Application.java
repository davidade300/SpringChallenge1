package com.challenge.coursechallenge1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.challenge"})
public class CourseChallenge1Application {

    public static void main(String[] args) {
        SpringApplication.run(CourseChallenge1Application.class, args);
    }



}
