package org.kurron.amqp

import org.springframework.amqp.core.AmqpTemplate
import org.springframework.amqp.rabbit.connection.ConnectionFactory
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.annotation.ScheduledAnnotationBeanPostProcessor

@SuppressWarnings( ['GrMethodMayBeStatic', 'GroovyUnusedDeclaration'] )
@Configuration
class AmqpContext {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Autowired
    private ConnectionFactory connectionFactory;

    @Bean
    public ScheduledAnnotationBeanPostProcessor scheduledAnnotationBeanPostProcessor() {
        new ScheduledAnnotationBeanPostProcessor()
    }

    @Bean
    public Sender mySender() {
        new Sender()
    }

    @Bean
    public SimpleMessageListenerContainer container() {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer( connectionFactory )
        Object listener = new Object() {
            @SuppressWarnings( 'GroovyUnusedDeclaration' )
            public void handleMessage( String foo ) {
                println( foo )
            }
        }
        MessageListenerAdapter adapter = new MessageListenerAdapter( listener )
        container.setMessageListener( adapter )
        container.setQueueNames( 'foo' )
        container
    }
}
