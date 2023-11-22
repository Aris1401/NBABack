package com.nba.statistics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.nba.statistics.repository", "com.nba.statistics.model"})
@ComponentScan(basePackages = "com.nba.statistics.repository")
@EnableJpaRepositories(basePackages = "com.nba.statistics.repository")
@EntityScan(basePackages = "com.nba.statistics.model")
public class NbaBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(NbaBackApplication.class, args);
	}
}
