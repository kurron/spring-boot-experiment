# spring-boot-experiment

## Building
Type `./gradlew` to build a WAR file that is both an executable and a deployable archive.

## Running
There are a couple ways to start the server:

* `java -jar build/libs/spring-boot-experiment.war`
* `./gradlew bootRun`
* deploy the WAR into an instance of Tomcat

To test out the service, point your browser to one of the following:

* [http://localhost:8080/hello](http://localhost:8080/hello) - exercise the web page generation logic
* [http://localhost:8080/greeting](http://localhost:8080/greeting) - exercise REST endpoint with defaulted argument
* [http://localhost:8080/greeting?name=User]( http://localhost:8080/greeting?name=User) - exercise REST endpoint with provided argument

## Actuator Support
Spring Boot provides support for the Operations team via an Actuator.  To see what support is available, point your browser to one of the folloing URLs:

* [http://localhost:8080/webjars](http://localhost:8080/webjars/) - to see what JARs are embedded in the WAR
* [http://localhost:8080/info](http://localhost:8080/info/) - to see general information
* [http://localhost:8080/mappings](http://localhost:8080/mappings/) - to see the available URI mappings
* [http://localhost:8080/health](http://localhost:8080/health/) - to see the health of the application
* [http://localhost:8080/dump](http://localhost:8080/dump/) - to see thread dump of the application
* [http://localhost:8080/metrics](http://localhost:8080/metrics/) - to various metrics of the application
* [http://localhost:8080/shutdown](http://localhost:8080/shutdown/) - to shutdown the application
* [http://localhost:8080/autoconfig](http://localhost:8080/autoconfig/) - to configuration of the application
* [http://localhost:8080/beans](http://localhost:8080/beans/) - to Spring Bean in the application
* [http://localhost:8080/trace](http://localhost:8080/trace/) - to see a trace the application
* [http://localhost:8080/env](http://localhost:8080/env/) - to see the current environment the application
* [http://localhost:8080/configprops](http://localhost:8080/configprops/) - not sure

This same support is available via JMX MBeans and can be accessed by various monitoring tools, including VisualVM that comes as part of
the Oracle JDK.

## Implementation Philosophy
The idea behind this project is to 'kick the tires' which means that there are more files here than necessary. In other words, you could
probably assemble the same functionality with fewer files, relying more on Spring Boots defaults.  One such example is how there is a separate
custom configuration for each module.  We probably could have simply used a single configuration but I wanted to know how Spring Boot would
react to a combination of of semi-independent modules.  I also chose to mix Groovy and XML Spring configurations.  Again, I wanted to know
how Spring Boot would react.


