package org.kurron

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan

@SuppressWarnings( 'GrMethodMayBeStatic' )
@EnableAutoConfiguration
@ComponentScan( ['org.kurron.web', 'org.kurron.rest'] )
//@ImportResource( 'integration-context.xml' )
//@EnableConfigurationProperties( ServiceProperties.class )
//@Import( RepositoryRestMvcConfiguration.class )
class Application {
/*
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
            @SuppressWarnings( 'GroovyUnusedDeclaration' )
            public void handleMessage( String foo ) {
                println( foo )
            }
        }
        MessageListenerAdapter adapter = new MessageListenerAdapter( listener )
        container.setMessageListener( adapter )
        container.setQueueNames( 'foo' )
        container
    }
*/
    static void main( String[] args ) {
        SpringApplication.run( Application, args )
    }
}
