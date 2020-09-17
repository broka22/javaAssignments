package assignment;

import javax.swing.JOptionPane;

public class Question4 {
	public static void main(String[] args) {
		int p = Integer.parseInt(JOptionPane.showInputDialog("Please enter the principle: "));
		int t = Integer.parseInt(JOptionPane.showInputDialog("Please enter the time: "));
		int r = Integer.parseInt(JOptionPane.showInputDialog("Please enter the rate: "));

		int simpleInt = (p * t * r) / 100;

		JOptionPane.showMessageDialog(null, simpleInt);
	}

}
