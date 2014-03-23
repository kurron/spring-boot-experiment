package com.transparent.asgard.thor.amqp

import groovy.util.logging.Slf4j
import org.springframework.amqp.core.AmqpAdmin
import org.springframework.amqp.core.Queue
import org.springframework.amqp.rabbit.core.RabbitOperations
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.actuate.metrics.CounterService
import org.springframework.scheduling.annotation.Scheduled

import javax.annotation.PostConstruct
import java.security.SecureRandom

@Slf4j
class Sender {

    @Autowired
    private RabbitOperations template

    @Autowired
    private AmqpAdmin admin

    @Autowired
    private CustomAmqpProperties configuration

    @Autowired
    private CounterService counter

    private final firstNames = ['Ron', 'Tara', 'Devan', 'Logan', 'Brian', 'Joan', 'Leah', 'Matt']
    private final lastNames = ['Kurr', 'Smith', 'Hersh', 'Salvatore', 'Davidson', 'Lefevre', 'Demayo', 'Widison']
    private static final RANDOM = new SecureRandom()

    @PostConstruct
    void setUpQueue() {
        admin.declareQueue( new Queue( configuration.queue ) )
    }

    @Scheduled( fixedDelay = 5000L )
    void send() {
        String message = "${selectName(lastNames)}, ${selectName(firstNames)}"
        log.debug( '{}', message )
        counter.increment( 'com.transparent.asgard.thor.amqp.Sender.send' )
        template.convertAndSend( configuration.queue, message )
    }

    private static String selectName(List<String> names) {
        names[RANDOM.nextInt(names.size())]
    }

}
