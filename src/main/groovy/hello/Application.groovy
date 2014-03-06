package hello

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.ImportResource

@EnableAutoConfiguration
@ComponentScan
@ImportResource( 'integration-context.xml' )
@EnableConfigurationProperties( ServiceProperties.class )
class Application {

    public static void main( String[] args ) {
        SpringApplication.run( Application, args )
    }
}
