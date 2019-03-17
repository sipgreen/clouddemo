package com.itcast.spdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpdemoApplication.class, args);
	}

}
