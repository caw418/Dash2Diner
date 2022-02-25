package restaurants;

import java.util.HashMap;

import model.Restaurant;

public class ChickFilA extends Restaurant {

	public ChickFilA()
	{
		this.name = "Chick-Fil-A";
		this.menu = new HashMap<String, Double>();
		this.deliveryCost = 2.99;
		menu.put("CFA Sand", 3.99);
		menu.put("8 ct Nuggets", 2.99);
		menu.put("12 ct Nuggets", 3.99);
		menu.put("Waffle Fries", 1.99);
	}
}
