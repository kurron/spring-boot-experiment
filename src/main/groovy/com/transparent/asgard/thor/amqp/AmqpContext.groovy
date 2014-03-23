package com.transparent.asgard.thor.amqp

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.ImportResource
import org.springframework.scheduling.annotation.ScheduledAnnotationBeanPostProcessor

@SuppressWarnings( ['GrMethodMayBeStatic', 'GroovyUnusedDeclaration'] )
@Configuration
@ImportResource( 'classpath:META-INF/spring/amqp-context.xml' )
@EnableConfigurationProperties( CustomAmqpProperties )
class AmqpContext {

    @Bean
    ScheduledAnnotationBeanPostProcessor scheduledAnnotationBeanPostProcessor() {
        new ScheduledAnnotationBeanPostProcessor()
    }

    @Bean
    Sender mySender() {
        new Sender()
    }
}
