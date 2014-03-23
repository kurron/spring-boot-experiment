package com.transparent.asgard.thor

import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@ContextConfiguration( classes = Application, loader = SpringApplicationContextLoader )
abstract class SpockIntegrationTest extends Specification  {
}
