package com.ty.FoodApp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FoodMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
		Food food=applicationContext.getBean("food",Food.class);
		food.eats();
		Food food1=applicationContext.getBean("food",Food.class);
		
		System.out.println(food);
		System.out.println(food1);
	}
}
