// a test of the Spring Boo CLI -- run via spring run app.groovy

@RestController
class ThisWillActuallyRun {

    @RequestMapping("/")
    String home() {
        return "Hello World!"
    }

}
