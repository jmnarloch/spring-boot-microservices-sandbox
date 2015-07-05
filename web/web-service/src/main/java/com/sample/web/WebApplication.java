package com.sample.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.security.oauth2.sso.EnableOAuth2Sso;

/**
 *
 */
@EnableOAuth2Sso
@EnableZuulProxy
@EnableFeignClients("com.sample.rest.client")
@EnableEurekaClient
@SpringBootApplication
public class WebApplication {

    public static void main(String[] args) {

        SpringApplication.run(WebApplication.class, args);
    }
}
