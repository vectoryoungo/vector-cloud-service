package com.magictown.freeworld.peterpan.kongfu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class KongfuApplication {

	public static void main(String[] args) {
		SpringApplication.run(KongfuApplication.class, args);
	}

}
