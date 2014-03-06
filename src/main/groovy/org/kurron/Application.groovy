package org.kurron

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan

@SuppressWarnings( 'GrMethodMayBeStatic' )
@EnableAutoConfiguration
@ComponentScan( ['org.kurron.web', 'org.kurron.rest', 'org.kurron.mongodb', 'org.kurron.amqp', 'org.kurron.integration'] )
class Application {
    static void main( String[] args ) {
        SpringApplication.run( Application, args )
    }
}
