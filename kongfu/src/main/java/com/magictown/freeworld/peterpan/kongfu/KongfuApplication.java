package com.magictown.freeworld.peterpan.kongfu;

import com.magictown.freeworld.peterpan.kongfu.stream.VectorCloudStreamReceiver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@EnableHystrixDashboard
@EnableBinding(value = {VectorCloudStreamReceiver.class})
public class KongfuApplication {

	public static void main(String[] args) {
		SpringApplication.run(KongfuApplication.class, args);
	}

}
