package com.hamidcode.apachekafka_streams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class  ApacheKafkaStreamsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApacheKafkaStreamsApplication.class, args);
		System.out.println("Spring app works ...");
	}

}
