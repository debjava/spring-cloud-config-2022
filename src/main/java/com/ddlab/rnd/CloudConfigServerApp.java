package com.ddlab.rnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CloudConfigServerApp {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigServerApp.class, args);
	}
}
