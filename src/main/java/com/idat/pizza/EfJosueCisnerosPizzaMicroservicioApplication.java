package com.idat.pizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EfJosueCisnerosPizzaMicroservicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfJosueCisnerosPizzaMicroservicioApplication.class, args);
	}

}
