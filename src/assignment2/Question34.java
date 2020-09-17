package assignment2;

import java.util.Scanner;

public class Question34 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size = input.nextInt();
		
		int[] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the values in an array");
			arr[i] = input.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[size-1];
			arr[size-1]=arr[i];
			arr[i]=temp;
			size = size-1;
			System.out.println(arr[i]);
		}
	}
}
