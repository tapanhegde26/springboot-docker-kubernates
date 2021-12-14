package com.learn.tapan.springbootkubernates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootKubernatesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootKubernatesApplication.class, args);
	}

}

@RestController
class HelloWorldController {
	private static final Logger logger = LoggerFactory.getLogger(HelloworldController.class);
	private final String version = "1.0";

	@GetMapping("/hello/{name}")
	public Map<String, String> hello(@Value("${greeting}") String greetingTemplate, @PathVariable String name) throws UnknownHostException {
		logger.info("Hello to: " + name);
		Map<String, String> response = new HashMap<>();

		String hostname = InetAddress.getLocalHost().getHostName();
		String greeting = greetingTemplate
				.replaceAll("\\$name", name)
				.replaceAll("\\$hostname", hostname)
				.replaceAll("\\$version", version);

		response.put("greeting", greeting);
		response.put("version", version);
		response.put("hostname", hostname);

		return response;
	}
}


