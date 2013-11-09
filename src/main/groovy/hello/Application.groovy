package hello

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@EnableAutoConfiguration
@ComponentScan
class Application {

    public static void main( String[] args ) {
        ApplicationContext ctx = SpringApplication.run( Application, args )

        println ("Let's inspect the beans provided by Spring Boot:" )

        String[] beanNames = ctx.getBeanDefinitionNames()
        Arrays.sort( beanNames )
        for ( String beanName : beanNames ) {
            println( beanName )
        }
    }
}
