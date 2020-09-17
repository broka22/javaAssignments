package assignment4;

import java.util.Scanner;

public class TakeOut {
	int trays;
	static int n;
	int people;
	
	public static void displayMainMenu() {// does not return
		System.out.println("Please choose the type of meal:");
		System.out.println("--------------------------------");
		System.out.println("1. Italian Food\n2. Chinese Food\n3. American Food\n");

		Scanner input = new Scanner(System.in);
		int in = input.nextInt();
		// store(in);

		System.out.println("Enter the no. of people ordering:");
		int people = input.nextInt();
		//int people = it;
		
		switch (in) {
		case 1:
			TakeOut.displayItalianFoodMenu(n);
			break;

		case 2:
			TakeOut.displayChineseFoodMenu();
			break;

		case 3:
			TakeOut.displayAmericaFoodMenu();
			break;

		default:
			System.out.println("The option is invalid.");
			break;
		}
	}

	// private static void store(int in) {
	// //int inp = TakeOut.displayMainMenu();
	// System.out.println(inp);
	// }

	public static double displayItalianFoodMenu(int n) {// does not return
		System.out.println("Choose one:");
		System.out.println("------------");
		System.out.println(
				"1. Lasagna Tray - Feeds 5 - $17.99\n2. Pizza Pack - Feeds 7 - $15.99\n3. Gazpacho Soup, salad and bread sticks pack - Feeds 4 - $12.99");
		Scanner input = new Scanner(System.in);
		int inp = input.nextInt();

		double price = 0;
		if (inp == 1) {
			price = 17.99;
			//System.out.println(price);
			determineTrays((int) price, 0);
		}
		if (inp == 2) {
			price = 15.99;
			//System.out.println(price);
			// getSubtotal(price,2);
		}
		if (inp == 3) {
			price = 12.99;
			//System.out.println(price);
			// store(price);
		}

		switch (inp) {
		case 1:
			System.out.println("Enter the no. of people ordering:");
			int it = input.nextInt();
			int people = it;
			int feeds = 5;

			if (people < 10 || people > 100) {
				System.out.println("The number of people are invalid.");
			} else {
				TakeOut.determineTrays(people, feeds);
			}
			break;
		case 2:
			System.out.println("Enter the no. of people ordering:");
			int ita = input.nextInt();
			int peo = ita;
			int feed = 7;

			if (peo < 10 || peo > 100) {
				System.out.println("The number of people are invalid.");
			} else {
				TakeOut.determineTrays(peo, feed);
			}
			break;

		case 3:
			System.out.println("Enter the no. of people ordering:");
			int ital = input.nextInt();
			int peopl = ital;
			int feeed = 4;

			if (peopl < 10 || peopl > 100) {
				System.out.println("The number of people are invalid.");
			} else {
				TakeOut.determineTrays(peopl, feeed);
			}
			break;

		default:
			System.out.println("The option is invalid.");
			break;
		}
	
		return price;
	}

	public static void displayChineseFoodMenu() {// does not return
		System.out.println("Choose one:");
		System.out.println("------------");
		System.out.println(
				"1. Chicken and Broccoli Tray (includes 7 wonton soups, 7 egg rolls) - feeds 7 - $18.99\n2. Sweet and Sour Pork Tray (includes 7 hot and sour soups, 7 egg rolls) - feeds 7 - $18.99\n3. Shrimp Fried Rice Tray (includes 10 egg rolls) - Feeds 5 - $10.99");
		Scanner input = new Scanner(System.in);
		int inp = input.nextInt();

		switch (inp) {
		case 1:
			System.out.println("Enter the no. of people ordering:");
			int ch = input.nextInt();
			int people = ch;
			int feeds = 7;

			if (people < 10 || people > 100) {
				System.out.println("The number of people are invalid.");
			} else {
				TakeOut.determineTrays(people, feeds);
			}
			break;
		case 2:
			System.out.println("Enter the no. of people ordering:");
			int chi = input.nextInt();
			int peo = chi;
			int feed = 7;

			if (peo < 10 || peo > 100) {
				System.out.println("The number of people are invalid.");
			} else {
				TakeOut.determineTrays(peo, feed);
			}
			break;

		case 3:
			System.out.println("Enter the no. of people ordering:");
			int chin = input.nextInt();
			int peopl = chin;
			int feeed = 5;

			if (peopl < 10 || peopl > 100) {
				System.out.println("The number of people are invalid.");
			} else {
				TakeOut.determineTrays(peopl, feeed);
			}
			break;

		default:
			System.out.println("The option is invalid.");
			break;
		}
	}

	public static void displayAmericaFoodMenu() {// does not return
		System.out.println("Choose one:");
		System.out.println("------------");
		System.out.println(
				"1. Hamburger and Hot Dog Tray - includes buns and condiments - feeds 8 - $21.99\n2. Grilled Chicken Sandwich and Mozzarella Sticks Tray - includes dipping sauces -Feeds 5 - $22.9\n3. Barbeque Tray - includes buns and peach cobbler - Feeds 10 - $26.99");
		Scanner input = new Scanner(System.in);
		int inp = input.nextInt();

		switch (inp) {
		case 1:
			System.out.println("Enter the no. of people ordering:");
			int am = input.nextInt();
			int people = am;
			int feeds = 8;

			if (people < 10 || people > 100) {
				System.out.println("The number of people are invalid.");
			} else {
				TakeOut.determineTrays(people, feeds);
			}
			break;
		case 2:
			System.out.println("Enter the no. of people ordering:");
			int ame = input.nextInt();
			int peo = ame;
			int feed = 5;

			if (peo < 10 || peo > 100) {
				System.out.println("The number of people are invalid.");
			} else {
				TakeOut.determineTrays(peo, feed);
			}
			break;

		case 3:
			System.out.println("Enter the no. of people ordering:");
			int amer = input.nextInt();
			int peopl = amer;
			int feeed = 10;

			if (peopl < 10 || peopl > 100) {
				System.out.println("The number of people are invalid.");
			} else {
				TakeOut.determineTrays(peopl, feeed);
			}
			break;

		default:
			System.out.println("The option is invalid.");
			break;
		}
	}

	public static int determineTrays(int people, int feeds) {// the rest returns
		int trays = 0;
		if (people % feeds == 0) {
			trays = people / feeds;
		} else if (people % feeds != 0) {
			trays = people / feeds + 1;
		} else {
			double price = people;
		}
		System.out.println("You need " + trays + " trays.");
		System.out.println("Feeds: " + feeds);
	
		getSubtotal(trays, people);
		return trays;
	}

	public static double getSubtotal(double price, int people) {

		double n = price;
		int peop = people;
		
		System.out.println("Price for "+peop+ " people:");
		getTax(n, people);
		return price;
	}

	public static double getTax(double subtotal, double taxrate) {
		double total = subtotal;
		int people = (int) taxrate;
		double tax = 0.07;

		double salesTax = total * tax;
		System.out.println("Tax: " + salesTax);
		getTip(total, salesTax);
		return salesTax;

	}

	public static double getTip(double subtotal, double tipRate) {

		double tax = tipRate;
		double tipPercentage = 0.15;
		
		double tip = subtotal * tipPercentage;
		System.out.println("Tip: " + tip);
		getGrandTotal(tip, subtotal, tax);//
		return tip;
	}

	public static double getGrandTotal(double subtotal, double tax, double tip) {
		double grandTotal = subtotal * tax * tip;
		System.out.println("Total (food, tax, tip): "+grandTotal);
		//pricePerPerson(grandTotal, people);
		return grandTotal;
	}

	public static double pricePerPerson(double grandTotal, int people){
		int peopl = people;
		System.out.println(+peopl+"Price per person:");
		return grandTotal;
	}

	public static int determineLeftOvers(int feeds, int trays, int people) {
		return feeds;
	}

}
