package org.kurron.asgard.thor.amqp

import org.kurron.asgard.thor.SpockIntegrationTest
import groovy.util.logging.Slf4j

@Slf4j
class SenderIntegrationTestSpockStyle extends SpockIntegrationTest {

    void 'sit here and look pretty'() {
        given:
        def i = 0

        when:
        log.debug( 'Sleeping...' )
        Thread.sleep( 1000 * 15 )

        then:
        true
    }
}
