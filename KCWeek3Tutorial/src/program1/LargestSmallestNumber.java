package program1;

import javax.swing.JOptionPane;

public class LargestSmallestNumber {

	public static void main(String[] args) {
		int counter = 0;
		int biggestNumber = 0;
		int smallestNumber = 0;
		while(counter<10){
			String number = JOptionPane.showInputDialog("Enter number: ");
			int integerNumber = Integer.parseInt(number);
			if (counter==0){
				biggestNumber = integerNumber;
				smallestNumber = integerNumber;
			}
			if(integerNumber>biggestNumber){
				biggestNumber = integerNumber;
			}
			if(integerNumber<smallestNumber){
				smallestNumber = integerNumber;
			}
			counter++;
		}
		String output = "Biggest number entered is " + biggestNumber + ". \n"
				+ "And smallest number entered is " + smallestNumber;
		JOptionPane.showMessageDialog(null, output);
	}

}
