package org.kurron.integration

import groovy.util.logging.Slf4j
import org.kurron.mongodb.Customer
import org.springframework.integration.annotation.ServiceActivator

@Slf4j
class Receiver {
    @SuppressWarnings( ["GroovyUnusedDeclaration", "GrMethodMayBeStatic"] )
    @ServiceActivator
    void persistCustomer( Customer customer) {
        log.debug( "{}", customer )
    }
}
