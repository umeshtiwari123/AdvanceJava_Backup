package com.ty.FoodApp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component(value="food")
@Scope(value="prototype")
public class Food {

	public void eats()
	{
		System.out.println("Tea Break is Pending");
	}
}
