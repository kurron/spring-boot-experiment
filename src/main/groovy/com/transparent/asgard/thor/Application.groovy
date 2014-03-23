package com.transparent.asgard.thor

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan

@SuppressWarnings( 'GrMethodMayBeStatic' )
@EnableAutoConfiguration
@ComponentScan( ['com.transparent.asgard.thor'] )
class Application {
    static void main( String[] args ) {
        SpringApplication.run( Application, args )
    }
}