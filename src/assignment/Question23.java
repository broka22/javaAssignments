package assignment;

import java.util.Scanner;

public class Question23 {
	
	public void calSeries(int a) {
		int sum = 0;
		for(int i=1; i<=a; i++){
			sum = sum + i;
		}
		System.out.println("The sum of the nth natural numbers is "+ sum);
	}
	
	public static void main(String[] args) {
		Question23 obj = new Question23();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n = input.nextInt();
		
		obj.calSeries(n);
	}
}
