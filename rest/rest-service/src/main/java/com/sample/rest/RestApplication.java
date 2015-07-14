package com.sample.rest;

import com.sample.rest.dao.MessageRepository;
import com.sample.rest.domain.Message;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
 *
 */
//@EnableOAuth2Resource
@EnableEurekaClient
@SpringBootApplication
public class RestApplication {

    @Bean
    public CommandLineRunner init(MessageRepository messageRepository) {
        return args -> {
            messageRepository.deleteAll();

            Arrays.asList("Hello World").forEach(msg ->
                    messageRepository.save(new Message(msg)));
        };
    }

    public static void main(String[] args) {

        SpringApplication.run(RestApplication.class, args);
    }
}
