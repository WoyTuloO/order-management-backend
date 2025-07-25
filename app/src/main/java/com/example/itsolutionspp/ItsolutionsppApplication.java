package com.example.itsolutionspp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@EnableAsync
@SpringBootApplication(
		scanBasePackages = {
				"com.example.itsolutionspp",
				"com.example.manufacturingorder",
				"com.example.customerorder"
		}
)
public class ItsolutionsppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItsolutionsppApplication.class, args);
	}

}
