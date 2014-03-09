package org.kurron.integration

import groovy.util.logging.Slf4j
import org.springframework.integration.annotation.ServiceActivator

@Slf4j
class Receiver {
    @SuppressWarnings( ["GroovyUnusedDeclaration", "GrMethodMayBeStatic"] )
    @ServiceActivator
    void echoMessage( String message ) {
        def parts = message.split( ',' )
        log.debug( "first name = {}, last name = {}", parts.last(), parts.first() )
    }
}
