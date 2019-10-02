package kacper.cichosz;

import javax.swing.JOptionPane;

public class Program6 {

	public static void main(String[] args) {
		int counter = 0;
		int biggestNumber = 0;
		int smallestNumber = 0;
		while(counter<10){
			String number = JOptionPane.showInputDialog("Enter number: ");
			int integerNumber = Integer.parseInt(number);
			if(integerNumber>biggestNumber){
				biggestNumber = integerNumber;
				counter++;
			} else if(integerNumber<smallestNumber){
				smallestNumber = integerNumber;
				counter++;
			}
			counter++;
			continue;	
		}
		String output = "Biggest number entered is " + biggestNumber + ". \n"
				+ "And smallest number entered is " + smallestNumber;
		JOptionPane.showMessageDialog(null, output);
		
	}

}
