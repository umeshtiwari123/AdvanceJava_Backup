package com.ty.foodapp.dto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.ty.foodapp.dto"})
public class Config {

	@Bean("user")
	public User getUser()
	{
		return new User();
	}
	
	@Bean("product")
	public Product getproduct()
	{
		return new Product();
	}
	
	@Bean("menu")
	public Menu getMenu()
	{
		return new Menu();
	}
	
	@Bean("ford")
	public FoodOrder getFoodOrder()
	{
		return new FoodOrder();
	}
	
	@Bean("fit")
	public FoodItems getItem()
	{
		return new FoodItems();
	}
	
}
