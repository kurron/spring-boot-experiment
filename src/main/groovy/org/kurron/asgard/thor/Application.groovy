package org.kurron.asgard.thor

import org.kurron.asgard.thor.amqp.Sender
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.context.web.SpringBootServletInitializer
import org.springframework.cache.annotation.EnableCaching
import org.springframework.cache.concurrent.ConcurrentMapCache
import org.springframework.cache.support.SimpleCacheManager
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import org.springframework.context.annotation.ImportResource
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration
import org.springframework.scheduling.annotation.ScheduledAnnotationBeanPostProcessor

@Configuration
@EnableConfigurationProperties( ApplicationProperties )
@SuppressWarnings( 'GrMethodMayBeStatic' )
@EnableAutoConfiguration
@EnableCaching
@ComponentScan( ['com.kurron.asgard.thor'] )
@Import( RepositoryRestMvcConfiguration )
@ImportResource( ['classpath:META-INF/spring/integration-context.xml',
                  'classpath:META-INF/spring/mongodb-context.xml'] )
class Application extends SpringBootServletInitializer {
    /**
     * Configurable properties used to customize the builder.
     **/
    @Autowired
    private ApplicationProperties theApplicationProperties

    /**
     * This gets called when we are running from the command-line.
     * @param args any arguments to the program.
     */
    static void main( String[] args ) {
        SpringApplication.run( Application, args )
    }

    /**
     * This gets called when running inside a Servlet 3.0 container.
     * @param builder context configuration helper.
     * @return builder instance.
     */
    @Override
    protected SpringApplicationBuilder configure( SpringApplicationBuilder builder) {
        builder.sources( Application )
    }

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
