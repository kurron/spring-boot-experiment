# spring-boot-experiment

Provides a REST service at *http://localhost:8080/greeting*.  There are a couple ways to start the server:

* `java -jar build/libs/spring-boot-experiment.jar`
* `./gradlew bootRun`

To test out the service, point your browser to either:

* [http://localhost:8080/hello](http://localhost:8080/hello) - exercise the web page generation logic
* [http://localhost:8080/greeting](http://localhost:8080/greeting) - exercise REST endpoint with defaulted argument
* [http://localhost:8080/greeting?name=User]( http://localhost:8080/greeting?name=User) - exercise REST endpoint with provided argument
