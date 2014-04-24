package com.transparent.asgard.thor.rest

import org.springframework.boot.context.properties.ConfigurationProperties

/**
 * Custom configuration properties.
 */
@ConfigurationProperties( value = 'rest', ignoreUnknownFields = false )
class CustomRestProperties {

    /**
     * An example of a custom property that could be accessed by a bean.
     */
    String template = 'Hello, %s!'
}
