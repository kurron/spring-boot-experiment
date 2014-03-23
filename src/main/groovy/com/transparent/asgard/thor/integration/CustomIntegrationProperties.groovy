package com.transparent.asgard.thor.integration

import org.springframework.boot.context.properties.ConfigurationProperties

/**
 * Custom configuration properties.
 */
@ConfigurationProperties( name = 'integration', ignoreUnknownFields = false )
class CustomIntegrationProperties {

    String message = '{}'
}
