package org.kurron.amqp

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Custom configuration properties.
 */
@ConfigurationProperties( name = 'amqp', ignoreUnknownFields = false )
class CustomAmqpProperties {

    /**
     * The name of the AMQP queue to bind to.
     */
    String queue = 'boot'
}
