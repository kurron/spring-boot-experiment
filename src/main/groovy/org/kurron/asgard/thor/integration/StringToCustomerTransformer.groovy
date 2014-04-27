package org.kurron.asgard.thor.integration

import groovy.util.logging.Slf4j
import org.kurron.asgard.thor.mongodb.Customer
import org.springframework.integration.annotation.Transformer
import org.springframework.stereotype.Component

@Slf4j
@Component
class StringToCustomerTransformer {
    @SuppressWarnings( ['GroovyUnusedDeclaration', 'GrMethodMayBeStatic'] )
    @Transformer
    Customer transform( String from ) {
        def parts = from.split( ',' )
        def to = new Customer( firstName: parts.last(), lastName: parts.first() )
        log.debug( 'Transformed from [{}] to [{}]', from, to )
        to
    }
}
