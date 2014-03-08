package org.kurron.web

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Custom configuration properties.
 */
@ConfigurationProperties( name = 'web', ignoreUnknownFields = false )
class CustomWebProperties {

    /**
     * An example of a custom property that could be accessed by a bean.
     */
    String foo = 'foo'
}
