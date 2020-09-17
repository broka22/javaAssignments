package assignment2;

import java.util.Scanner;

public class Question28 {

	public static boolean isPrimeNumber(int n) {
		boolean prime;
		prime = true;
		if (n == 0 || n == 1) {
			prime = false;
			return prime;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}

	public static void firstNthPrime(int n) {
		for (int i = 2; i <= n; i++) {
			if (isPrimeNumber(i)) {
				System.out.println(i);
			}
		}
	}

	public static void allPrimeBetween(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (isPrimeNumber(i)) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String decision = "";
		
		do {
			System.out.println("enter your choice:");
			String inp = input.next();
			
		switch (inp) {
		case "1":
			System.out.println("enter a number to check whether prime or not");
			int n = input.nextInt();
			//boolean isPrime = isPrimeNumber(n);
			if (isPrimeNumber(n)) {
				System.out.println(n + " The number is prime");
			} else {
				System.out.println(n + " The number is not prime");
			}
			break;
			
		case "2":
			System.out.println("enter to find the nth prime number");
			int p = input.nextInt();
			firstNthPrime(p);
			break;
			
		case "3":
			System.out.println("enter the start number");
			int start = input.nextInt();
			System.out.println("enter the end number");
			int end = input.nextInt();
			allPrimeBetween(start, end);
			break;
		
		default:
			System.out.println("wrong choice");
			break;
		}
		System.out.println("type y|Y to continue");
		decision = input.next();
		} while (decision.equalsIgnoreCase("y"));
		
		System.out.println("Thank you!");
		input.close();
	}

}
