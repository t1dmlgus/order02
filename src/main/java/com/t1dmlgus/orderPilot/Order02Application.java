package com.t1dmlgus.orderPilot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Order02Application {

	public static void main(String[] args) {
		SpringApplication.run(Order02Application.class, args);
	}

}
