package com.ty.FoodApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.ty.FoodApp"})
public class Config {

	@Bean(name="food")
	public Food getFood()
	{
		return new Food();
	}
}
