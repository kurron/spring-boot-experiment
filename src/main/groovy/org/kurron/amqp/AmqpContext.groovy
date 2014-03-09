package org.kurron.amqp

import org.springframework.amqp.core.AmqpTemplate
import org.springframework.amqp.rabbit.connection.ConnectionFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.ImportResource
import org.springframework.scheduling.annotation.ScheduledAnnotationBeanPostProcessor

@SuppressWarnings( ['GrMethodMayBeStatic', 'GroovyUnusedDeclaration'] )
@Configuration
@ImportResource( 'META-INF/spring/amqp-context.xml' )
@EnableConfigurationProperties( CustomAmqpProperties.class )
class AmqpContext {

    @Autowired
    private AmqpTemplate template;

    @Autowired
    private ConnectionFactory factory;

    @Autowired
    private CustomAmqpProperties configuration

    @Bean
    public ScheduledAnnotationBeanPostProcessor scheduledAnnotationBeanPostProcessor() {
        new ScheduledAnnotationBeanPostProcessor()
    }

    @Bean
    public Sender mySender() {
        new Sender()
    }
}
