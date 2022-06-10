package com.baban.testdrive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import com.baban.controller.DriverController;

@SpringBootApplication
@ComponentScan(basePackageClasses = DriverController.class, basePackages = { "com.baban.*" })
@EntityScan("com.baban.entity")
public class DriverApplication {

	public static void main(String[] args) {
		SpringApplication.run(DriverApplication.class, args);
	}
}
