package com.sample.rest.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 */
@Entity
public class Message {

    @Id
    private long id;

    private String content;

    public Message() {
    }

    public Message(String content) {
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
