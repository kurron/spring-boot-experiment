package org.kurron.amqp

import groovy.util.logging.Slf4j
import org.kurron.SpockIntegrationTest

@Slf4j
class SenderIntegrationTestSpockStyle extends SpockIntegrationTest {

    void sitHereAndLookPretty() {
        given:
        def i = 0

        when:
        log.debug( 'Sleeping...' )
        Thread.sleep( 1000 * 15 )

        then:
        true
    }
}
