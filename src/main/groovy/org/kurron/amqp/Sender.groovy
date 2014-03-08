package org.kurron.amqp

import javax.annotation.PostConstruct;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

class Sender {

    @Autowired
    private RabbitTemplate rabbitTemplate

    @Autowired
    private AmqpAdmin amqpAdmin

    @Autowired
    private CustomAmqpProperties configuration

    @PostConstruct
    void setUpQueue() {
        amqpAdmin.declareQueue( new Queue( configuration.queue ) )
    }

    @Scheduled( fixedDelay = 5000L )
    void send() {
        String message = " ${configuration.prefix} ${Long.toHexString( System.currentTimeMillis() ).toUpperCase()}"
        rabbitTemplate.convertAndSend( configuration.queue, message )
    }

}