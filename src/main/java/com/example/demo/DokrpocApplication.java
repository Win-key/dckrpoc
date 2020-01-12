package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DokrpocApplication {

	@GetMapping("/dckr/hello")
	public String hello(){
		return "Hi.. Hello..";
	}
	public static void main(String[] args) {
		SpringApplication.run(DokrpocApplication.class, args);
	}

}
