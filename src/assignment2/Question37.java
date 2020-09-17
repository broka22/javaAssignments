package assignment2;

import java.util.Scanner;

public class Question37 {

	public static void main(String[] args) {
		Question37 obj = new Question37();

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the row:");
		int row = input.nextInt();
		
		System.out.println("Enter the column:");
		int column = input.nextInt();

		int[][] arr = new int[row][column];
		int[][] array = new int[row][column];
		//int[][] sum = new int[row][column];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println("Enter the values:");
				arr[i][j] = input.nextInt();
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.println("Enter the values:");
				array[i][j] = input.nextInt();
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("====================");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("====================");
		int sum;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < array.length; j++) {
				sum = arr[i][j] + array[i][j];
				//int ouput[][]=sum;
				System.out.print(sum+" ");
			}
			System.out.println();
		}
		
	}
}