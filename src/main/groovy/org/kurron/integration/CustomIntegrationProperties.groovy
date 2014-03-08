package org.kurron.integration

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Custom configuration properties.
 */
@ConfigurationProperties( name = 'integration', ignoreUnknownFields = false )
class CustomIntegrationProperties {

    String greeting = 'Hello'
}
