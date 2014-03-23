/*
 * Copyright (c) 2013. Transparent Language.  All rights reserved.
 */
package com.transparent

import spock.lang.Specification

/**
 * An example of a Spock-based unit test.
 */
class ExampleUnitTest extends Specification {
    def 'exercise simple math'() {
        given: 'valid environment'
        def a = 1
        def b = 2

        when: 'number are added'
        def c = a + b

        then: '3 is the result'
        3 == c
    }
}
