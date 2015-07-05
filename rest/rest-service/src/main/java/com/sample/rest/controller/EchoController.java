package com.sample.rest.controller;

import com.sample.rest.api.EchoService;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class EchoController implements EchoService {

    @Override
    public String home() {
        return "Hello world";
    }
}
