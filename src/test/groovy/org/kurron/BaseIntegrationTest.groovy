package org.kurron

import org.springframework.boot.test.SpringApplicationConfiguration
import spock.lang.Specification

@SpringApplicationConfiguration( classes = Application.class )
class BaseIntegrationTest extends Specification  {
}
