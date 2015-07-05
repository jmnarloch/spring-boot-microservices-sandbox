package com.sample.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 */
@EnableEurekaClient
@SpringBootApplication
public class RestApplication {

    public static void main(String[] args) {

        SpringApplication.run(RestApplication.class, args);
    }
}
