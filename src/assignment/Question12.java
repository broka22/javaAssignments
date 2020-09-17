package assignment;

import java.util.Scanner;

public class Question12 {
	
	public void display() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name:");
		String n = input.next();
		
		System.out.println("Enter the roll:");
		int r = input.nextInt();
		
		System.out.println("Enter the nationality:");
		String na = input.next();
		
		System.out.println();
		System.out.println("Person's name is "+ n);
		System.out.println("Person's roll is "+ r);
		System.out.println("Person's nationality is "+ na);
		System.out.println("Thank you!");

	}
	public static void main(String[] args) {
		Question12 obj = new Question12();
		//Scanner input = new Scanner(System.in);
		obj.display();
	}
}
