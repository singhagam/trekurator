package com.trekurator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class TrekuratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrekuratorApplication.class, args);
	}

}
