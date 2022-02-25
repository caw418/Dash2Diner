package main;

import java.util.ArrayList;
import java.util.Scanner;

import model.Restaurant;
import restaurants.ChickFilA;
import restaurants.Chipotle;
import restaurants.McDonalds;

public class App {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		ChickFilA cfa = new ChickFilA();
		Chipotle chipotle = new Chipotle();
		McDonalds mcd = new McDonalds();
		Restaurant restaurant = null;
		int userInput;
		double price = 0;
		String itemToOrder;
		ArrayList<String> itemsOrdered = new ArrayList<>();
		
		System.out.println("Welcome to Dash 2 Diner!");
		System.out.println("Choose a restaurant to order from.");
		System.out.println("1 - Chick-Fil-A");
		System.out.println("2 - Chipotle");
		System.out.println("3 - McDonald's");
		userInput = console.nextInt();
		switch(userInput)
		{
		case 1:
			restaurant = cfa;
			break;
		case 2:
			restaurant = chipotle;
			break;
		case 3:
			restaurant = mcd;
			break;
		default:
			System.out.println("Choose a valid option.");
			break;
		}
		do
		{
			System.out.println("1 - View Menu");
			System.out.println("2 - Order");
			userInput = console.nextInt();
			if(userInput == 1)
			{
				restaurant.printMenu();
			}
			else if(userInput == 2)
			{
				do
				{
					System.out.println("Enter the item you want to order: ");
					itemToOrder = console.next() + console.nextLine();
					try
					{
						price = price + restaurant.menu.get(itemToOrder);
						itemsOrdered.add(itemToOrder);
					}
					catch(NullPointerException e)
					{
						System.out.println("Enter a valid menu item.");
					}
					System.out.println("Order more? 1 - Yes, 2 - No.");
					userInput = console.nextInt();
				}
				while(userInput == 1);
			}
			else
			{
				System.out.println("Choose a valid option.");
			}
			System.out.println("Choose another option? 1 - Yes, 2 - No");
			userInput = console.nextInt();
		}
		while(userInput == 1);
		
		System.out.println("You ordered: ");
		for(String item : itemsOrdered)
		{
			System.out.println(item);
		}
		System.out.println("Your Total is: " + price);
	}
}