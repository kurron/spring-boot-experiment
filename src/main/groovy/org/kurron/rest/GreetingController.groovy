package org.kurron.rest

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

import java.util.concurrent.atomic.AtomicLong

/**
 * Simple REST controller.
 */
@SuppressWarnings( 'GroovyUnusedDeclaration' )
@Controller
class GreetingController {

    private final AtomicLong counter = new AtomicLong()

    @Autowired
    private CustomRestProperties configuration

    @RequestMapping( '/greeting' )
    @ResponseBody
    Greeting greeting( @RequestParam( value = 'name', required = false, defaultValue = 'World' ) String name ) {
        new Greeting( counter.incrementAndGet(), String.format( configuration.template, name ) )
    }
}