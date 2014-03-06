package hello

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SuppressWarnings("GroovyUnusedDeclaration")
@RestController
class HelloController {

    @SuppressWarnings("GrMethodMayBeStatic")
    @RequestMapping( '/hello' )
    String index() {
        'Greetings from Spring Boot!'
    }

}