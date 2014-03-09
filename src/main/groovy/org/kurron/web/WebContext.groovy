package org.kurron.web

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.ImportResource

@SuppressWarnings( ['GrMethodMayBeStatic', 'GroovyUnusedDeclaration'] )
@Configuration
@ImportResource( 'META-INF/spring/web-context.xml' )
@EnableConfigurationProperties( CustomWebProperties.class )
class WebContext {

    // if we had any web-specific beans, they would go in here.
}
