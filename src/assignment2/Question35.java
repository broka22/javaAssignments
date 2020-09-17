package assignment2;

import java.util.Scanner;

public class Question35 {

	public void secondLarge(int arr[], int size) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The second largest number in an array is: " + arr[size-2]);
	}

	public static void main(String[] args) {
		Question35 obj = new Question35();

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = input.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the values in an array");
			arr[i] = input.nextInt();
		}

		obj.secondLarge(arr, size);
	}
}
