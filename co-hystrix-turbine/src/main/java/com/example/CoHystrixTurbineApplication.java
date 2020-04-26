package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;


@EnableTurbineStream
@SpringBootApplication
public class CoHystrixTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoHystrixTurbineApplication.class, args);
	}

}
