package kacper.cichosz;

import javax.swing.JOptionPane;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber = 5;
		int secondNumber = 10;
		
		int addingResult = firstNumber + secondNumber;
		int multiplyResult = firstNumber * secondNumber;
		
		if(firstNumber == secondNumber){
			String output = "Number " + firstNumber + " is equal to second number " + secondNumber + 
					"\nBy adding numbers you will get result = " + addingResult +
					"\nBy multipling those numbers you will get result = " + multiplyResult;
			JOptionPane.showMessageDialog(null, output);
		}else{
			if(firstNumber>secondNumber){
				String output = "Number " + firstNumber + " is greater then second number " + secondNumber+ 
						"\nBy adding numbers you will get result = " + addingResult +
						"\nBy multipling those numbers you will get result = " + multiplyResult;
				JOptionPane.showMessageDialog(null, output);
			}else{
				String output = "Number " + secondNumber + " is greater then first number " + firstNumber+ 
						"\nBy adding numbers you will get result = " + addingResult +
						"\nBy multipling those numbers you will get result = " + multiplyResult;;
				JOptionPane.showMessageDialog(null, output);
			}
		}

	}

}
