package hello

import org.springframework.amqp.core.AmqpTemplate
import org.springframework.amqp.rabbit.connection.ConnectionFactory
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.ImportResource
import org.springframework.scheduling.annotation.ScheduledAnnotationBeanPostProcessor

@EnableAutoConfiguration
@ComponentScan
@ImportResource( 'integration-context.xml' )
@EnableConfigurationProperties( ServiceProperties.class )
class Application {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Autowired
    private ConnectionFactory connectionFactory;

    @Bean
    public ScheduledAnnotationBeanPostProcessor scheduledAnnotationBeanPostProcessor() {
        new ScheduledAnnotationBeanPostProcessor()
    }

    @Bean
    public Sender mySender() {
        new Sender()
    }

    @Bean
    public SimpleMessageListenerContainer container() {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer( connectionFactory )
        Object listener = new Object() {
            @SuppressWarnings( "unused" )
            public void handleMessage( String foo ) {
                println( foo )
            }
        }
        MessageListenerAdapter adapter = new MessageListenerAdapter( listener )
        container.setMessageListener( adapter )
        container.setQueueNames( 'foo' )
        container
    }

    static void main( String[] args ) {
        SpringApplication.run( Application, args )
    }
}
