package assignment;

import java.util.Scanner;

public class Question22 {
	
	public void table(int n) {
		for(int i=1; i<=10; i++){
			int mult = n * i;
			System.out.println(n+" * "+i+" = "+ mult);
		}
	}
	
	public static void main(String[] args) {
		Question22 obj = new Question22();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter any number to perform the table");
		int n = input.nextInt();
		
		obj.table(n);
	}
}
