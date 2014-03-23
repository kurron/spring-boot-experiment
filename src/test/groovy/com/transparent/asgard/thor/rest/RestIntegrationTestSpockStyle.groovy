package com.transparent.asgard.thor.rest

import com.transparent.asgard.thor.SpockIntegrationTest
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.embedded.EmbeddedWebApplicationContext
import org.springframework.boot.test.IntegrationTest
import org.springframework.boot.test.RestTemplates
import org.springframework.test.context.web.WebAppConfiguration

@Slf4j
@IntegrationTest
@WebAppConfiguration
class RestIntegrationTestSpockStyle extends SpockIntegrationTest {

    @Autowired
    EmbeddedWebApplicationContext server

    void 'exercise health check'() {
        given: 'a valid REST template'
        def template = RestTemplates.get()

        and: 'we know the server port'
        def port = server.embeddedServletContainer.port
        log.debug( 'Server is listening on port {}', port )

        when: 'we make a health check'
        log.debug( 'Sleeping...' )
        Thread.sleep( 1000 * 5 )
        log.debug( 'Requesting health check...' )
        def response = template.getForObject( "http://localhost:${port}/health", String )
        log.debug( 'Response is {}', response )

        then: 'we get an ok response'
        response.contains( 'awesome' )
    }
}