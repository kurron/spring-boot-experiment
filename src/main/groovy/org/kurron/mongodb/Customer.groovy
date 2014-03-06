package org.kurron.mongodb

import groovy.transform.Canonical

/**
 * MongoDB entity.
 */
import org.springframework.data.annotation.Id;

@Canonical
class Customer {

    @Id
    String id
    String firstName
    String lastName
}