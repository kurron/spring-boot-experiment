package org.kurron.asgard.thor.web

import org.springframework.boot.context.properties.ConfigurationProperties

/**
 * Custom configuration properties.
 */
@ConfigurationProperties( value = 'web', ignoreUnknownFields = false )
class CustomWebProperties {

    /**
     * An example of a custom property that could be accessed by a bean.
     */
    String message = 'Greetings from Spring Boot!'
}