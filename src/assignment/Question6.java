package assignment;

import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		double pi = 3.1415926;

		System.out.println("Enter the radius:");
		Scanner input = new Scanner(System.in);
		int r = input.nextInt();

		double perimeter1 = 2 * pi * r;
		System.out.println("The perimeter of a circle is: " + perimeter1 + "\n");
		System.out.println("**********************************");
		System.out.println();

		System.out.println("Enter the length of a rectangle:");
		int l = input.nextInt();
		System.out.println("Enter the width of a rectangle:");
		int w = input.nextInt();

		int perimeter2 = 2 * (l + w);
		System.out.println("The perimeter of a Rectangle is: " + perimeter2 + "\n");
		System.out.println("**********************************");
		System.out.println();

		System.out.println("Enter the 1st side of a triangle:");
		int a = input.nextInt();
		System.out.println("Enter the 2nd side of a triangle:");
		int b = input.nextInt();
		System.out.println("Enter the 3rd side of a triangle:");
		int c = input.nextInt();

		int perimeter3 = a + b + c;

		System.out.println("The perimeter of a Triangle is: " + perimeter3 + "\n");
		System.out.println("thank you!! see you again!!");

	}

}
