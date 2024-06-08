package com.briz.springbootmodelmapperexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootModelmapperExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootModelmapperExampleApplication.class, args);
	}
	/*
	@Bean // this can be also done into configuration class too 
	ModelMapper mymodel()
	{
	return new ModelMapper();
	 */

}
