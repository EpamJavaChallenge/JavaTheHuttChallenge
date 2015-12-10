package com.code.challenge.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.code.challenge.repositories.FilesRepository;

@SpringBootApplication
@ComponentScan(basePackages={"com.code.challenge.configuration", "com.code.challenge.controllers", "com.code.challenge.repositories"})
@EnableMongoRepositories(basePackageClasses=FilesRepository.class)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
