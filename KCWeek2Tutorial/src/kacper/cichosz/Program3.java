package kacper.cichosz;

import javax.swing.JOptionPane;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numberOfPapers = JOptionPane.showInputDialog("Enter number of papers: ");
		int totalPapers = Integer.parseInt(numberOfPapers);
		double moneyCounter = 0;
		double payment;
		if(totalPapers>100){
			double reminderOfPapers = totalPapers - 100;
			payment = (reminderOfPapers * 0.15) + 10;
			moneyCounter += payment;
		}else{
			payment = totalPapers * 0.1;
			moneyCounter += payment;
		}
		String output = "In order to print " + totalPapers + " papers you have to pay: £" + moneyCounter;
		JOptionPane.showMessageDialog(null, output);
	}

}
