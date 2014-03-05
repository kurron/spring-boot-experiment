package hello

import groovy.transform.Canonical

/**
 * Simple resource.
 */
@Canonical
class Greeting {
    long id
    String content
}
