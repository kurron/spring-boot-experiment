package org.kurron.amqp

import groovy.util.logging.Slf4j
import org.springframework.integration.annotation.ServiceActivator

@Slf4j
class EchoService {
    @ServiceActivator
    void echoMessage( String message ) {
        log.debug( "Just heard {}", message )
    }
}
