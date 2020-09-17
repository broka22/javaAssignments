package assignment;

import java.util.Scanner;

public class Question10 {
	public static void main(String[] arg) {

		System.out.println("Enter the FIRST number: ");
		Scanner input = new Scanner(System.in);
		float u = input.nextFloat();

		System.out.println("Enter the SECOND number: ");
		float t = input.nextFloat();

		System.out.println("Enter the THIRD number: ");
		float a = input.nextFloat();

		double s1 = (u * t) + (a * Math.pow(t, 2)) / 2;
		System.out.println("The first solution is: " + s1 + "\n");
		System.out.println("********************************");

		System.out.println("Enter the value of b: ");
		float b = input.nextFloat();
		System.out.println("Enter the value of c: ");
		float c = input.nextFloat();

		double s = (a + b + c) / 2;
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

		System.out.println("The area of given number is : " + area);

		System.out.println("********************************");

		double x = Math.sqrt(Math.pow(b, 2) - 4 * a * c);

		System.out.println("The value of X is " + x);
	}

}
