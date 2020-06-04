package com.amdemo.mark.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.amdemo.mark.controllers.TransactionRegistrationController;
import com.amdemo.mark.controllers.TransactionRetrieveController;

@SpringBootApplication
@ComponentScan(basePackageClasses = TransactionRetrieveController.class)
@ComponentScan(basePackageClasses = TransactionRegistrationController.class)
public class AmexApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmexApplication.class, args);
	}

}
