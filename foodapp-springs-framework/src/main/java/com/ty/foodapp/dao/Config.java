package com.ty.foodapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.ty.foodapp.dao"})
public class Config {

	@Bean(value="emf")
	public EntityManagerFactory getEMF()
	{
		return Persistence.createEntityManagerFactory("foodapp");
	}
	
	@Bean(value="em")
	public EntityManager getEM()
	{
		return getEMF().createEntityManager();
	}
	
	@Bean(value="et")
	public EntityTransaction getET()
	{
		return getEM().getTransaction();
	}
	
	@Bean("menudao")
	public MenuDao getMenuDao()
	{
		return new MenuDao();
	}
	
	@Bean("foodorderdao")
	public FoodOrderDao getfoodDao()
	{
		return new FoodOrderDao();
				
	}
	
	

}
