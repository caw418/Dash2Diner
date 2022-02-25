package restaurants;

import java.util.HashMap;

import model.Restaurant;

public class McDonalds extends Restaurant {

	public McDonalds()
	{
		this.name = "McDonals";
		this.menu = new HashMap<String, Double>();
		this.deliveryCost = 1.99;
		menu.put("Big Mac", 3.59);
		menu.put("Quarter Pounder", 3.99);
		menu.put("10 Piece McNuggets", 3.49);
		menu.put("Fries", 2.99);
	}
}