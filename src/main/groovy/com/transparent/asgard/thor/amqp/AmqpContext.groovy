package com.transparent.asgard.thor.amqp

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.cache.Cache
import org.springframework.cache.annotation.EnableCaching
import org.springframework.cache.concurrent.ConcurrentMapCache
import org.springframework.cache.support.SimpleCacheManager
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.ImportResource
import org.springframework.scheduling.annotation.ScheduledAnnotationBeanPostProcessor

@SuppressWarnings( ['GrMethodMayBeStatic', 'GroovyUnusedDeclaration'] )
@Configuration
@ImportResource( 'classpath:META-INF/spring/amqp-context.xml' )
@EnableConfigurationProperties( CustomAmqpProperties )
@EnableCaching
class AmqpContext {

    @Bean
    ScheduledAnnotationBeanPostProcessor scheduledAnnotationBeanPostProcessor() {
        new ScheduledAnnotationBeanPostProcessor()
    }

    @Bean
    Sender mySender() {
        new Sender()
    }

    @Bean
    SimpleCacheManager cacheManager() {
        def manager = new SimpleCacheManager()
        manager.caches = [new ConcurrentMapCache( 'ronbo' )]
        manager
    }
}
