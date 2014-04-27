package org.kurron.asgard.thor.rest

import groovy.transform.Canonical

/**
 * Simple resource.
 */
@Canonical
class Greeting {
    long id
    String content
}
