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

    @Autowired
    private CustomerRepository repository

    @Autowired
    private CustomIntegrationProperties configuration

    @SuppressWarnings( ["GroovyUnusedDeclaration", "GrMethodMayBeStatic"] )
    @ServiceActivator
    void persistCustomer( Customer customer) {
        def persisted = repository.save( customer )
        log.debug( configuration.message , persisted )
    }
}
