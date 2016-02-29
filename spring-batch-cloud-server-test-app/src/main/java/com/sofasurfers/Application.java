package com.sofasurfers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sofasurfers.springbatchcloud.server.config.SpringBatchCloudServerConfiguration;

@SpringBootApplication
@SpringBatchCloudServerConfiguration
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
