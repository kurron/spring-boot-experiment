package org.kurron.asgard.thor.mongodb

import groovy.transform.Canonical
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@SuppressWarnings( 'GroovyUnusedDeclaration' )
@Canonical
@Document
class Customer {

    @Id
    String id
    String firstName
    String lastName
}
