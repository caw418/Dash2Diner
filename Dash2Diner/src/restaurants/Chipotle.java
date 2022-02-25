package restaurants;

import java.util.HashMap;

import model.Restaurant;

public class Chipotle extends Restaurant {

	public Chipotle()
	{
		this.name = "Chipotle";
		this.menu = new HashMap<String, Double>();
		this.deliveryCost = 2.99;
		menu.put("Steak Bowl", 10.99);
		menu.put("Steak Burrito", 10.99);
		menu.put("Chicken Bowl", 9.99);
		menu.put("Chicken Burrito", 9.99);
	}
}