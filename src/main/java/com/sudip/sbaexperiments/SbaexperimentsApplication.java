package com.sudip.sbaexperiments;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class SbaexperimentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbaexperimentsApplication.class, args);
	}
}
