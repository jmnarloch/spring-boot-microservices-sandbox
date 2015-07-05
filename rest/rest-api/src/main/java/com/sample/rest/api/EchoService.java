package com.sample.rest.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 */
public interface EchoService {

    @RequestMapping(method = RequestMethod.GET, value = "/home")
    String home();
}
