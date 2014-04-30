package org.kurron.asgard.thor.rest

import org.kurron.asgard.thor.ApplicationProperties
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.actuate.metrics.GaugeService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

import java.util.concurrent.atomic.AtomicLong

/**
 * Simple REST controller.
 */
@SuppressWarnings( 'GroovyUnusedDeclaration' )
@RestController
class GreetingController {

    private final AtomicLong counter = new AtomicLong()

    @Autowired
    GaugeService gauge

    @Autowired
    private ApplicationProperties configuration

    @RequestMapping( '/greeting' )
    Greeting greeting( @RequestParam( value = 'name', required = false, defaultValue = 'World' ) String name ) {
        gauge.submit( 'greeting-latency', 1.0 ) // pretend we are keeping track of how long the service would take
        new Greeting( counter.incrementAndGet(), String.format( configuration.template, name ) )
    }
}
