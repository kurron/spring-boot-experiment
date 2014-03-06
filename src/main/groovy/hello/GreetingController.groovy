package hello

import org.springframework.beans.factory.annotation.Autowired

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Simple REST controller.
 */
@Controller
class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private CustomerRepository repository

    @RequestMapping( '/greeting' )
    @ResponseBody Greeting greeting( @RequestParam(value="name", required=false, defaultValue="World") String name ) {
        Customer saved = repository.save( new Customer( firstName: 'Bob', lastName:  'Jones' ) )
        println "Just saved ${saved}"
        new Greeting( counter.incrementAndGet(), String.format( template, name ) )
    }
}