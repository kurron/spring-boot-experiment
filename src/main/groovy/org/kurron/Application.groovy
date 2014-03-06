package org.kurron

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Import
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration

@SuppressWarnings( 'GrMethodMayBeStatic' )
@EnableAutoConfiguration
@ComponentScan( ['org.kurron.web', 'org.kurron.rest', 'org.kurron.mongodb', 'org.kurron.amqp'] )
//@ImportResource( 'integration-context.xml' )
//@EnableConfigurationProperties( ServiceProperties.class )
@Import( RepositoryRestMvcConfiguration.class )
class Application {
    static void main( String[] args ) {
        SpringApplication.run( Application, args )
    }
}
