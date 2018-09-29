package com.sree.microservice.MicroSeleniumUtils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication

@EnableFeignClients("com.sree.microservice.MicroSeleniumUtils")
public class MicroSeleniumUtilsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroSeleniumUtilsApplication.class, args);
	}
}
