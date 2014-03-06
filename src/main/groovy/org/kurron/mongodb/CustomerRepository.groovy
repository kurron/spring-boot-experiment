package org.kurron.mongodb

import org.kurron.mongodb.Customer
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

/**
 * Spring Data MongoDB generated repository.
 */
@RepositoryRestResource( collectionResourceRel = 'customers', path = 'customers' )
interface CustomerRepository extends MongoRepository<Customer, String> {

    Customer findByFirstName( String firstName )

    List<Customer> findByLastName( String lastName )

}
