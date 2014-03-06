package hello

import hello.Customer
import org.springframework.data.mongodb.repository.MongoRepository

/**
 * Spring Data MongoDB generated repository.
 */
interface CustomerRepository extends MongoRepository<Customer, String> {

    Customer findByFirstName( String firstName )

    List<Customer> findByLastName( String lastName )

}
