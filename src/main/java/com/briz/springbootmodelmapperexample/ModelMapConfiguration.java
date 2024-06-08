package com.briz.springbootmodelmapperexample;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapConfiguration 
{
@Bean  // this bean can be declared into main class too note this too
ModelMapper mymodelmapper()
{
	return new ModelMapper();
}

}
