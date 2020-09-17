package assignment;

import java.util.Scanner;

public class Questioin5 {
	public static void main(String[] args) {

		double pi = 3.1415926;

		System.out.println("Enter the radius:");
		Scanner input = new Scanner(System.in);
		int r = input.nextInt();

		double area1 = pi * Math.pow(r, 2);
		System.out.println("The area of a circle is: " + area1);
		System.out.println("**********************************");
		System.out.println();

		System.out.println("Enter the length of a rectangle:");
		int l = input.nextInt();
		System.out.println("Enter the width of a rectangle:");
		int w = input.nextInt();

		int area2 = l * w;
		System.out.println("The area of a Rectangle is: " + area2);
		System.out.println("**********************************");
		System.out.println();

		System.out.println("Enter the Breadth of a triangle:");
		int b = input.nextInt();
		System.out.println("Enter the height of a triangle:");
		int h = input.nextInt();

		int area3 = (b * h) / 2;
		System.out.println("The area of a Triangle is: " + area3);
		System.out.println("thank you!! see you again!!");

	}

}
