package model;

import java.util.HashMap;

public abstract class Restaurant {

	public String name;
	public HashMap<String, Double> menu;
	public double deliveryCost;
	
	public void printMenu()
	{
		System.out.println(menu);
	}
}