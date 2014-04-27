package org.kurron.asgard.thor

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.context.web.SpringBootServletInitializer
import org.springframework.context.annotation.ComponentScan

@SuppressWarnings( 'GrMethodMayBeStatic' )
@EnableAutoConfiguration
@ComponentScan( ['com.kurron.asgard.thor'] )
class Application extends SpringBootServletInitializer {

    /**
     * This gets called when we are running from the command-line.
     * @param args any arguments to the program.
     */
    static void main( String[] args ) {
        SpringApplication.run( Application, args )
    }

    @Override
    protected SpringApplicationBuilder configure( SpringApplicationBuilder application ) {
        application.sources( Application )
    }

}
