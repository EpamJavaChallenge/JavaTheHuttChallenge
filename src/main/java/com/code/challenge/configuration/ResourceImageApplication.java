package com.code.challenge.configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.code.challenge.repositories.ImageResourceRepository;

@SpringBootApplication
public class ResourceImageApplication {

	@Autowired
	private ImageResourceRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(ResourceImageApplication.class, args);
	}

}
