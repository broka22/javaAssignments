package assignment;

import java.util.Scanner;

public class Question13 {
	
	public void display(int n) {
		if(n<0){
			System.out.println(n+" is a negative number.");
		}else{
			System.out.println("try again.");
		}
	}
	
	public static void main(String[] args) {
		Question13 obj = new Question13();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = input.nextInt();
		obj.display(n);
	}
}
