package com.sample.web.controller;

import com.sample.rest.client.EchoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class HomeController {

    @Autowired
    private EchoClient echoClient;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String home() {

        return echoClient.home();
    }
}
