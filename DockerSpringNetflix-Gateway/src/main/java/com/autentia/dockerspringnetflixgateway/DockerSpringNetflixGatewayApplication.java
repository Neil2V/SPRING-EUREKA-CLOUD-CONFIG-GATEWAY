package com.autentia.dockerspringnetflixgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class DockerSpringNetflixGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringNetflixGatewayApplication.class, args);
	}

}
