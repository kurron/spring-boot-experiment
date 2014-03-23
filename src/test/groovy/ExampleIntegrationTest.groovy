/*
 * Copyright (c) 2013. Transparent Language.  All rights reserved.
 */
package com.transparent

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

/**
 * An example of a Spock-based integration test.
 */
@ContextConfiguration( locations = ['/com/transparent/ExampleIntegrationTest-context.xml'] )
class ExampleIntegrationTest extends Specification {

    @Autowired
    String favoriteBeerStyle

    def 'exercise spring configuration'() {
        when: 'field is autowired'
        assert favoriteBeerStyle

        then: 'expected value style is returned'
        favoriteBeerStyle == 'IPA'
        println "Favorite beer style is ${favoriteBeerStyle}"
    }
}
