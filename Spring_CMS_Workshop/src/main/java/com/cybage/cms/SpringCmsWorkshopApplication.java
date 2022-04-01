package com.cybage.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories(basePackages="com.cybage.repository")
@SpringBootApplication(scanBasePackages = "com.cybage")
@EntityScan(basePackages="com.cybage.model")
public class SpringCmsWorkshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCmsWorkshopApplication.class, args);
		System.out.println("Hello AJay");
	}

}
