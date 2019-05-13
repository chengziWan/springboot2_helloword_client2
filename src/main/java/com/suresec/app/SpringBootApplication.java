package com.suresec.app;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@org.springframework.boot.autoconfigure.SpringBootApplication
@RestController
public class SpringBootApplication {
	@RequestMapping("/aa")
	String Home() {
		return "hello";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplication.class, args);
	}

}
