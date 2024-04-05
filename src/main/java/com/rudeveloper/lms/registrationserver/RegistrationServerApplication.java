package com.rudeveloper.lms.registrationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDisc
public class RegistrationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationServerApplication.class, args);
	}

}
