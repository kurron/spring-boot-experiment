package com.transparent.asgard.thor.mongodb

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.query.Param

/**
 * Spring Data MongoDB generated repository.
 */
@SuppressWarnings( 'GroovyUnusedDeclaration' )
interface CustomerRepository extends MongoRepository<Customer, String> {
    List<Customer> findByFirstName( @Param( 'name' ) String name )
    List<Customer> findByLastName( @Param( 'name' ) String name )
}
