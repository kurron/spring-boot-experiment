package org.kurron.rest

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Custom configuration properties.
 */
@ConfigurationProperties( name = 'rest', ignoreUnknownFields = false )
class CustomRestProperties {

    /**
     * An example of a custom property that could be accessed by a bean.
     */
    String foo = 'foo'
}
