package com.transparent.asgard.thor.integration

import com.transparent.asgard.thor.mongodb.Customer
import com.transparent.asgard.thor.mongodb.CustomerRepository
import groovy.util.logging.Slf4j
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
    private CustomIntegrationProperties configuration

    @Autowired
    private CounterService counter

    @SuppressWarnings( ['GroovyUnusedDeclaration', 'GrMethodMayBeStatic'] )
    @ServiceActivator
    void persistCustomer( Customer customer) {
        def persisted = repository.save( customer )
        log.debug( configuration.message , persisted )
        counter.increment( 'com.transparent.asgard.thor.integration.Receiver.persistCustomer' )

    }
}
