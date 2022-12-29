package com.infy.springbootrestapicrudapp.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
@EntityScan
@SpringBootApplication
public class SpringbootrestapicrudappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootrestapicrudappApplication.class, args);
	}

}
