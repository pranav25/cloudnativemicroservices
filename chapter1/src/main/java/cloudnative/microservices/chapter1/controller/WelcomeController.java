package cloudnative.microservices.chapter1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cloudnative.microservices.chapter1.domain.Welcome;

@RestController
public class WelcomeController {
private static final String helloWorldTemplate = "Hello World %s!";
@GetMapping("/welcome") 
	public String welcome() {
		return  "Hello";
	}

@GetMapping("/welcome-with-object")
public Welcome welcomeWithObject() {
  return new Welcome("Hello World");
}

@GetMapping("/welcome/name/{name}") 
public Welcome welcomewithParam(@PathVariable String name) {
	return new Welcome(String.format(helloWorldTemplate, name));
}
}
