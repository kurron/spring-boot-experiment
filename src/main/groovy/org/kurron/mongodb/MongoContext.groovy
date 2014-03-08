package org.kurron.mongodb

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.ImportResource

@SuppressWarnings( ['GrMethodMayBeStatic', 'GroovyUnusedDeclaration'] )
@Configuration
@ImportResource( 'amqp-context.xml' )
@EnableConfigurationProperties( CustomMongoProperties.class )
class MongoContext {

    // if we had any MongoDB-specific beans, they would go in here.
}