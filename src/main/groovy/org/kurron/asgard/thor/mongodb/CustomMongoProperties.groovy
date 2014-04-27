package org.kurron.asgard.thor.mongodb

import org.springframework.boot.context.properties.ConfigurationProperties

/**
 * Custom configuration properties.
 */
@ConfigurationProperties( value = 'mongodb', ignoreUnknownFields = false )
class CustomMongoProperties {

    /**
     * An example of a custom property that could be accessed by a bean.
     */
    String foo = 'foo'
}
