package org.kurron.amqp

import groovy.util.logging.Slf4j
import org.springframework.amqp.core.AmqpAdmin
import org.springframework.amqp.core.Queue
import org.springframework.amqp.rabbit.core.RabbitOperations
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.scheduling.annotation.Scheduled

import javax.annotation.PostConstruct

@Slf4j
class Sender {

    @Autowired
    private RabbitOperations template

    @Autowired
    private AmqpAdmin admin

    @Autowired
    private CustomAmqpProperties configuration

    @PostConstruct
    void setUpQueue() {
        admin.declareQueue( new Queue( configuration.queue ) )
    }

    @Scheduled( fixedDelay = 5000L )
    void send() {
        String message = " ${configuration.prefix} ${Long.toHexString( System.currentTimeMillis() ).toUpperCase()}"
        log.debug( "{}", message )
        template.convertAndSend( configuration.queue, message )
    }

}