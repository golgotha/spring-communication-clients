package com.valeryk.httpclients.rabbitmq;

import com.valeryk.httpclients.AppConfig;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/**
 * @author Valery Kantor
 */
@Log4j2
@Component
public class Publisher {
    private RabbitTemplate rabbitTemplate;

    public Publisher(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void publish(String value) {
        log.info("Publishing message: {}", value);
        rabbitTemplate.convertAndSend(AppConfig.EXCHANGE, "foo.bar", value);
    }

    @Scheduled(fixedRate = 1000)
    public void sayHello() {
        publish("Hello");
    }
}
