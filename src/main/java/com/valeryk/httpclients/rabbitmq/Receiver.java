package com.valeryk.httpclients.rabbitmq;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

/**
 * @author Valery Kantor
 */
@Log4j2
@Component
public class Receiver {

    public void receive(String message) {
        log.info("Received: {}", message);
    }
}
