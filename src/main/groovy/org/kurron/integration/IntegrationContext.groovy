package org.kurron.integration

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.ImportResource

@SuppressWarnings( ['GrMethodMayBeStatic', 'GroovyUnusedDeclaration'] )
@Configuration
@ImportResource( 'integration-context.xml' )
@EnableConfigurationProperties( CustomIntegrationProperties.class )
class IntegrationContext {

    // if we had any Spring Integration-specific beans, they would go in here.
}
