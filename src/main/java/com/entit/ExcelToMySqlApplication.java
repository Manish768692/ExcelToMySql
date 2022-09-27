package com.entit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ExcelToMySqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExcelToMySqlApplication.class, args);
	}

}
