package org.kurron.mongodb

import groovy.transform.Canonical

/**
 * MongoDB entity.
 */
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document;

@SuppressWarnings( 'GroovyUnusedDeclaration' )
@Canonical
@Document
class Customer {

    @Id
    String id
    String firstName
    String lastName
}
