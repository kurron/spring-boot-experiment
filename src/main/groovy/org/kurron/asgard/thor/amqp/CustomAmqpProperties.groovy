package org.kurron.asgard.thor.amqp

import org.springframework.boot.context.properties.ConfigurationProperties

/**
 * Custom configuration properties.
 */
@ConfigurationProperties( value = 'amqp', ignoreUnknownFields = false )
class CustomAmqpProperties {

    /**
     * The name of the AMQP queue to bind to.
     */
    String queue = 'boot'

    /**
     * The text the sender pre-pends to its message.
     */
    String prefix = 'From AMQP'
}
