package org.kurron.integration

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.integration.annotation.MessageEndpoint
import org.springframework.integration.annotation.ServiceActivator
import org.springframework.util.StreamUtils

@SuppressWarnings( 'GroovyUnusedDeclaration' )
@MessageEndpoint( 'sampleEndpoint' )
class SampleEndpoint {

    @Autowired
    private HelloWorldService helloWorldService

    @ServiceActivator
    public String hello( File input ) {
        FileInputStream inputStream = new FileInputStream( input )
        String name = new String( StreamUtils.copyToByteArray( inputStream ) )
        inputStream.close()
        helloWorldService.getHelloMessage( name )
    }

}
