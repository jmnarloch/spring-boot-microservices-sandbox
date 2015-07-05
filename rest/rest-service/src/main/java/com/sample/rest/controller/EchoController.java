package com.sample.rest.controller;

import com.sample.rest.api.EchoService;
import com.sample.rest.dao.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class EchoController implements EchoService {

    @Autowired
    private MessageRepository messageRepository;

    @Override
    public String home() {
        return messageRepository.findAll()
                .stream().findFirst()
                .get().getContent();
    }
}
