package org.kurron.integration

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

/**
 * Simple Spring Integration service.
 */
@Component
class HelloWorldService {

    @Autowired
    private CustomIntegrationProperties configuration

    String getHelloMessage( String name ) {
        configuration.greeting + ' ' + name
    }

}
