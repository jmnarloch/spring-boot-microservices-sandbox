package com.sample.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 *
 */
@EnableEurekaClient
@EnableFeignClients("com.sample.rest.client")
@SpringBootApplication
public class WebApplication {

    public static void main(String[] args) {

        SpringApplication.run(WebApplication.class, args);
    }
}
