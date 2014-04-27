package org.kurron.asgard.thor.rest

import groovy.util.logging.Slf4j
import org.springframework.boot.actuate.health.HealthIndicator
import org.springframework.stereotype.Component

@Slf4j
@Component
class CustomHealthController implements HealthIndicator<String> {

    @Override
    String health() {
        log.debug( 'Custom health check called.' )
        'Doing really awesome! Thanks for asking.'
    }

}
