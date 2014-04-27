package org.kurron.asgard.thor.amqp

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.ImportResource
import org.springframework.context.annotation.Profile
import org.springframework.scheduling.annotation.ScheduledAnnotationBeanPostProcessor

/**
 * This is an example of how to provide profile-specific configurations.
 */
@SuppressWarnings( ['GrMethodMayBeStatic', 'GroovyUnusedDeclaration'] )
@Configuration
@ImportResource( 'classpath:META-INF/spring/amqp-context.xml' )
@Profile( 'qa' )
@EnableConfigurationProperties( CustomAmqpProperties )
class AmqpContextQA {

    @Bean
    ScheduledAnnotationBeanPostProcessor scheduledAnnotationBeanPostProcessor() {
        new ScheduledAnnotationBeanPostProcessor()
    }

    @Bean
    Sender mySender() {
        new Sender()
    }
}
