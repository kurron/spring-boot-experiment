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

    @PostConstruct
    void setUpQueue() {
        amqpAdmin.declareQueue( new Queue( 'foo' ) )
    }

    @Scheduled( fixedDelay = 5000L )
    void send() {
        def message = new StringBuilder( 'From AMQP ' ).append( Long.toHexString( System.currentTimeMillis() ).toUpperCase() ).toString()
        rabbitTemplate.convertAndSend( 'foo', message )
    }

}