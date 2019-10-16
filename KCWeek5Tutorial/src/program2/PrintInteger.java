package program2;

import javax.swing.JOptionPane;

public class PrintInteger {

	public static void main(String[] args) {
		printInteger(5);
	}
	
	public static void printInteger(int number) {
		String output = "Your number is " + number;
		JOptionPane.showMessageDialog(null, output);
	}

}
