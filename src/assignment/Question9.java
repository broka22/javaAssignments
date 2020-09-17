package assignment;

import java.util.Scanner;

public class Question9 {
		public static void main (String [] arg) {
			
		    double p = 0.454;
		    System.out.println("Enter the number of Pound you want to convert into KG ");
		    Scanner input = new Scanner(System.in);
		    int obj = input.nextInt();
		    
		    double Kilogram = obj * p;
		    
		    System.out.println("The pound of " + obj +"  is equals to " + Kilogram + " kg.");
		    
		    
		 
	 }

}
