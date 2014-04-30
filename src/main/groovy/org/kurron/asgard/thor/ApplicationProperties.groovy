package org.kurron.asgard.thor

import org.springframework.boot.context.properties.ConfigurationProperties

/**
 * Custom configuration properties for the entire application.
 */
@ConfigurationProperties( value = 'custom', ignoreUnknownFields = false )
class ApplicationProperties {

    /**
     * The name of the AMQP queue to bind to.
     */
    String queue = 'boot'

    /**
     * The text the sender pre-pends to its message.
     */
    String prefix = 'From AMQP'

    String message = '{}'

    /**
     * An example of a custom property that could be accessed by a bean.
     */
    String foo = 'foo'

    /**
     * An example of a custom property that could be accessed by a bean.
     */
    String template = 'Hello, %s!'

    /**
     * An example of a custom property that could be accessed by a bean.
     */
    String webMessage = 'Greetings from Spring Boot!'

}
