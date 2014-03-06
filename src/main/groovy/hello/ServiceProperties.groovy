package hello

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Custom configuration properties.
 */
@ConfigurationProperties( name = 'service', ignoreUnknownFields = false )
class ServiceProperties {

    String greeting = 'Hello'
}
