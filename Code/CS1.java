//Call by Value

//application which will display the menu items along with the prizes and 
//once the order is done,it will calculate the total amount of the order and display it 
import java.util.*;

public class CS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] Number = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		String [] Drinks = {"Whiskey    ", "Aged Rum   ", "Gin Tonic  ", "Vodka      ", "Cognac     ", "Tequila    ", "Local Beer ", "Import Beer", "Champagne  "};
		double [] Price = {12.95, 11.56, 10.32, 9.85, 8.90, 7.42, 8.56, 9.34, 10.67};
		String [] Prizes = {"Egg Rolls", "Guacamole & Chips", "Margarita Pizza", " Chicken Kebab", "  Garlic Shrimp", " Bravas Potatoes", " Fried Calamari", " Stuffed Red Peppers", "Cheese Platter"};
		
		Scanner input = new Scanner(System.in);
		System.out.println("Display Alex's Drinks Menu?");
		String answer = input.next();
		//input.close();
		
		if (answer.equalsIgnoreCase("yes")){
			System.out.println("\n\n");
			System.out.println("No."+"  "+"Drink"+"  "+"    Price"+"  "+"Prize");
			showMenu(Number, Drinks, Price, Prizes);
			
			Scanner order = new Scanner(System.in);
			System.out.println("\n\n");
			System.out.println("Would you like to order drinks?");
			String yesOrder = order.next();
					
			if (yesOrder.equalsIgnoreCase("yes")){
				Scanner numDrinks = new Scanner(System.in);
				System.out.println("\n\n");
				System.out.println("How many drinks would you like to order?");
				int drinksOrdered = numDrinks.nextInt();
				//numDrinks.close();
				
				int [] custOrders = new int [drinksOrdered];
				for(int counter = 0; counter<drinksOrdered; counter++) {
					System.out.println("Enter Drink No. "+(counter+1));
					custOrders[counter] = numDrinks.nextInt();
				}
				
				System.out.println("\n\n");
				System.out.println("You ordered: ");
				displayOrder(custOrders, Number, Drinks, Price, Prizes);
			}
			
			else {
				System.out.println("Thanks for visiting Alex's!");
			}
		}
		else {
			System.out.println("Thanks for visiting Alex's!");
			}
		
		}
	
	public static void showMenu(int w[], String x[], double y[], String z[]) {
		for(int i = 0; i < w.length; i++) {
			System.out.println(w[i]+"  "+x[i]+"  "+y[i]+"  "+z[i]);
		}
	}
	
	public static void displayOrder(int p[], int q[], String x[], double y[], String z[]) {
		double sum = 0;
		for (int i = 0; i<p.length; i++) {
			for (int j = 0; j<q.length; j++) {
				if (p[i] == q[j]) {
					System.out.println(p[i]+"  "+x[i]+"  "+y[i]+"  "+z[i]);
					sum += y[i];
				}
			}
		}
		System.out.println("\n\n");
		System.out.println("Yor total bill is: $."+ sum);
	}
}
