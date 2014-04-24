package com.transparent.asgard.thor.integration

import org.springframework.boot.context.properties.ConfigurationProperties

/**
 * Custom configuration properties.
 */
@ConfigurationProperties( value = 'integration', ignoreUnknownFields = false )
class CustomIntegrationProperties {

    String message = '{}'
}
