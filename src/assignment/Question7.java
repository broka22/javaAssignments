package assignment;

import java.util.Scanner;

public class Question7 {
	public static void main(String[] arg) {

		double pi = 3.1415;
		System.out.println("Enter the radius of a cylinder: ");
		Scanner input = new Scanner(System.in);
		int radius = input.nextInt();
		System.out.println("Enter the height of a cylinder");
		int height = input.nextInt();

		double volume = pi * Math.pow(radius, 2) * height;
		System.out.println("The volume of a Cylinder which has radius of " + radius + "  and height of " + height
				+ " is: " + volume);

	}

}
