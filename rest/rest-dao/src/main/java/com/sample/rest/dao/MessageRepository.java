package com.sample.rest.dao;

import com.sample.rest.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 */
public interface MessageRepository extends JpaRepository<Message, Long> {
}
