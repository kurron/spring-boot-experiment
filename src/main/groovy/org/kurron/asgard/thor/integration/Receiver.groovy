package org.kurron.asgard.thor.integration

import org.kurron.asgard.thor.ApplicationProperties
import org.kurron.asgard.thor.mongodb.CustomerRepository
import groovy.util.logging.Slf4j
import org.kurron.asgard.thor.mongodb.Customer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.actuate.metrics.CounterService
import org.springframework.integration.annotation.MessageEndpoint
import org.springframework.integration.annotation.ServiceActivator

@Slf4j
@MessageEndpoint
class Receiver {

    @Autowired
    private CustomerRepository repository

    @Autowired
    private ApplicationProperties configuration

    @Autowired
    private CounterService counter

    @SuppressWarnings( ['GroovyUnusedDeclaration', 'GrMethodMayBeStatic'] )
    @ServiceActivator
    void persistCustomer( Customer customer) {
        def persisted = repository.save( customer )
        log.debug( configuration.message , persisted )
        counter.increment( 'Receiver.persistCustomer' )

    }
}
