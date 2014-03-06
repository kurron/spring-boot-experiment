package org.kurron.rest

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration

@SuppressWarnings( ['GrMethodMayBeStatic', 'GroovyUnusedDeclaration'] )
@Configuration
@Import( RepositoryRestMvcConfiguration.class )
class RestContext {

    // if we had any REST-specific beans, they would go in here.
}
