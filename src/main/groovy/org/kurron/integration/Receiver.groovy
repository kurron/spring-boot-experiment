package org.kurron.integration

import groovy.util.logging.Slf4j
import org.kurron.mongodb.Customer
import org.kurron.mongodb.CustomerRepository
import org.springframework.integration.annotation.ServiceActivator

@Slf4j
class Receiver {


    private final CustomerRepository theRepository

    Receiver( CustomerRepository repository ) {
        theRepository = repository
    }

    @SuppressWarnings( ["GroovyUnusedDeclaration", "GrMethodMayBeStatic"] )
    @ServiceActivator
    void persistCustomer( Customer customer) {
        def persisted = theRepository.save( customer )
        log.debug( "Just stored {} in MongoDB", persisted )
    }
}
