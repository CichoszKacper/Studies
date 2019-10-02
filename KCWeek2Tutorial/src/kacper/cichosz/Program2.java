package kacper.cichosz;

import java.util.Random;

import javax.swing.JOptionPane;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random generatedNumber = new Random();
		int number = generatedNumber.nextInt(10);
		
		if(number%2==0){
			String output = "Your generated number " + number + " is even number.";
			JOptionPane.showMessageDialog(null, output);
		}else{
			String output = "Your generated number " + number + " is odd number.";
			JOptionPane.showMessageDialog(null, output);
		}
	}

}
