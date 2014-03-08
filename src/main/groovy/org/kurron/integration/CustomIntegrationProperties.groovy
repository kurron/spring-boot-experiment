package org.kurron.integration

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Custom configuration properties.
 */
@ConfigurationProperties( name = 'intagration', ignoreUnknownFields = false )
class CustomIntegrationProperties {

    String greeting = 'Hello'
}
