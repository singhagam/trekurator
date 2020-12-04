package com.java.trekurator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.java.trekurator.model")
@SpringBootApplication
public class TrekuratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrekuratorApplication.class, args);
	}

}
