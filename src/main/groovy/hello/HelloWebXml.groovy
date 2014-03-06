package hello

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * Servlet 3.0 web initializer to launch Spring if we are in a web container.
 */
class HelloWebXml extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure( SpringApplicationBuilder application ) {
        application.sources( Application.class )
    }

}
