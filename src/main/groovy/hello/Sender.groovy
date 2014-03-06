package hello

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

    @Scheduled( fixedDelay = 1000L )
    void send() {
        rabbitTemplate.convertAndSend( 'foo', 'hello' )
    }

}