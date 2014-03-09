package org.kurron.web

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SuppressWarnings("GroovyUnusedDeclaration")
@RestController
class HelloController {

    @Autowired
    private CustomWebProperties configuration

    @SuppressWarnings("GrMethodMayBeStatic")
    @RequestMapping( '/hello' )
    String index() {
        configuration.message
    }

}