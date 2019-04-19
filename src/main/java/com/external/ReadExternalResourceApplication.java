package com.external;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Karthikeyan.v
 *
 */
@SpringBootApplication
@EnableConfigurationProperties(ConfigFile.class)
@RestController
public class ReadExternalResourceApplication {	
	
	public static void main(String[] args) {
		SpringApplication.run(ReadExternalResourceApplication.class, args);
	}
	
	@GetMapping("/")
	public String welcome() {
		return "Welcome to Spring Boot Application..!";
	}
}