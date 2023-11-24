package com.Springboot.app;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/Welcome")
	public String Welcome() {
		return "Welcome to the spring boot app";
	}

}
