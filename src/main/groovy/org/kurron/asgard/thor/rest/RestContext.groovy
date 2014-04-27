package org.kurron.asgard.thor.rest

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import org.springframework.context.annotation.ImportResource
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration

@SuppressWarnings( ['GrMethodMayBeStatic', 'GroovyUnusedDeclaration'] )
@Configuration
@Import( RepositoryRestMvcConfiguration )
@ImportResource( 'classpath:META-INF/spring/rest-context.xml' )
@EnableConfigurationProperties( CustomRestProperties )
class RestContext {

    // if we had any REST-specific beans, they would go in here.
}
