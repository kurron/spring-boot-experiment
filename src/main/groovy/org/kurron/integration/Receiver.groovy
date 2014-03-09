package org.kurron.integration

import groovy.util.logging.Slf4j
import org.kurron.mongodb.Customer
import org.kurron.mongodb.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.integration.annotation.MessageEndpoint
import org.springframework.integration.annotation.ServiceActivator

@Slf4j
@MessageEndpoint
class Receiver {

    private final CustomerRepository theRepository

    @Autowired
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
