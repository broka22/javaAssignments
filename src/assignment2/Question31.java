package assignment2;

import java.util.Scanner;

public class Question31 {

	public void pattern(int n) {
		for (int i = 0; i < n; i++) {//row
			int num = 1;
			for (int j = 0; j <= i; j++) {//column
				System.out.print(num+" ");
				num++;
			}
			System.out.print("\n");
		}
	}		

	public static void main(String[] args) {
		Question31 obj = new Question31();
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of patterns you would like to see: ");
		int a = input.nextInt();
		obj.pattern(a);
		
	}
}
