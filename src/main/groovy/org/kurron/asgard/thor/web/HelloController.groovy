package org.kurron.asgard.thor.web

import org.kurron.asgard.thor.ApplicationProperties
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.actuate.metrics.CounterService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SuppressWarnings( 'GroovyUnusedDeclaration' )
@RestController
class HelloController {

    @Autowired
    private ApplicationProperties configuration

    @Autowired
    private CounterService counter

    @SuppressWarnings( 'GrMethodMayBeStatic' )
    @RequestMapping( '/hello' )
    String index() {
        counter.increment( 'HelloController.hello' )
        configuration.webMessage
    }

}
