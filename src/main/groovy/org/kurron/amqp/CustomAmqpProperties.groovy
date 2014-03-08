package org.kurron.amqp

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Custom configuration properties.
 */
@ConfigurationProperties( name = 'amqp', ignoreUnknownFields = false )
class CustomAmqpProperties {

    /**
     * An example of a custom property that could be accessed by a bean.
     */
    String foo = 'foo'
}
