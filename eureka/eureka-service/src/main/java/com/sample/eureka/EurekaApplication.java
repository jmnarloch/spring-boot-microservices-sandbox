package com.sample.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * An entry point for the Eureka entry point.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaApplication.class)
                .web(true)
                .run(args);
    }
}
