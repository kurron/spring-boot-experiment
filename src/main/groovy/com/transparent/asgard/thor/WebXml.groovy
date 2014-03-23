package com.transparent.asgard.thor

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.context.web.SpringBootServletInitializer
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

/**
 * Servlet 3.0 web initializer to launch Spring if we are in a web container.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan( ['com.transparent.asgard.thor'] )
class WebXml extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure( SpringApplicationBuilder application ) {
        application.sources( Application )
    }

}
