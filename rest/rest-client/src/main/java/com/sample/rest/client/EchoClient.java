package com.sample.rest.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 */
@FeignClient("rest-service")
public interface EchoClient {

    @RequestMapping(method = RequestMethod.GET, value = "/home")
    String home();
}
