# spring-boot-experiment

Provides a REST service at *http://localhost:8080/greeting*.  There are a couple ways to start the server:

* `java -jar build/libs/spring-boot-experiment.jar`
* `./gradlew bootRun`

To test out the service, point your browser to either:

* [http://localhost:8080/greeting](http://localhost:8080/greeting)
* [http://localhost:8080/greeting?name=User]( http://localhost:8080/greeting?name=User)

If you want to hit a plain HTML view try [http://localhost:8080/](http://localhost:8080/).  That should get you
to a plain 'Hello World' view.
