package com.example.eurekaclient142;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Eurekaclient142Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurekaclient142Application.class, args);
    }
}
