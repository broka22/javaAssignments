package assignment2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Question30 {

	public void fibonacci(int inp) { //with int type
		int a = 0, b = 0, c = 1;

		for (int i = 1; i <= inp; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(a);
		}
		//return a;
	}

	public static void main(String[] args) {
		Question30 obj = new Question30();
		int p = Integer
				.parseInt(JOptionPane.showInputDialog("Please enter the number of fibonacci series to be displayed"));
		obj.fibonacci(p);
		//int q = fibonacci(p);
		//JOptionPane.showMessageDialog(null, q);
	}
}

