package org.kurron.integration

import groovy.util.logging.Slf4j
import org.springframework.integration.annotation.ServiceActivator

@Slf4j
class Receiver {
    @SuppressWarnings( ["GroovyUnusedDeclaration", "GrMethodMayBeStatic"] )
    @ServiceActivator
    void echoMessage( String message ) {
        log.debug( "{}", message )
    }
}
