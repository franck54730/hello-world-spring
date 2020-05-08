package lu.its4u.hello.world.rest.endpoints;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWorldResource {

	private static final Logger logger = LoggerFactory.getLogger(HelloWorldResource.class);

	@GetMapping("/")
	public String helloWorld() {
		logger.info("Someone ask a hello from hearth");
		return "Hello World!";
	}
	

	@GetMapping("/mars")
	public String helloMars() {
		logger.info("Someone ask a hello from mars");
		return "Hello Mars!";
	}

//	@RequestMapping("/")
//	public String index() {
//		return "Greetings from Spring Boot!";
//	}
}
