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

    final def firstNames = ['Ron', 'Tara', 'Devan', 'Logan', 'Brian', 'Joan', 'Leah', 'Matt']
    final def lastNames = ['Kurr', 'Smith', 'Hersh', 'Salvatore', 'Davidson', 'Lefevre', 'Demayo', 'Widison']
    static final Random random = new Random()

    @PostConstruct
    void setUpQueue() {
        admin.declareQueue( new Queue( configuration.queue ) )
    }

    @Scheduled( fixedDelay = 5000L )
    void send() {
        String message = "${selectName(lastNames)}, ${selectName(firstNames)}"
        log.debug( "{}", message )
        template.convertAndSend( configuration.queue, message )
    }

    private static String selectName(List<String> names) {
        names[random.nextInt(names.size())]
    }

}