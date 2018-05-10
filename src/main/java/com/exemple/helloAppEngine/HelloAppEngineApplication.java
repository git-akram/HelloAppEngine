package com.exemple.helloAppEngine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloAppEngineApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloAppEngineApplication.class, args);
	}

	@GetMapping("/omar")
	public String hello() {
		return "57";
	}

	@GetMapping("/omar/ali")
	public String helloAli() {
		return "23 ans";
	}

	@GetMapping("/omar/abdou")
	public String helloAbdou() {
		return "22 ans";
	}
}
