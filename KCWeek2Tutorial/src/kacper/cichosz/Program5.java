package kacper.cichosz;

import javax.swing.JOptionPane;

public class Program5 {

	public static void main(String[] args) {
		String numberOfPapers = JOptionPane.showInputDialog("Enter number of papers: ");
		int totalPapers = Integer.parseInt(numberOfPapers);
		double moneyCounter = 0;
		double payment;
		double rateForMoreThen150 = 0.2;
		if(totalPapers>100){
			if (totalPapers>150){
				double reminderFrom150Papers = totalPapers - 150;
				payment = (reminderFrom150Papers * rateForMoreThen150) + (50*0.15) + (10);
				moneyCounter += payment;
			} else {
				double reminderOfPapers = totalPapers - 100;
				payment = (reminderOfPapers * 0.15) + 10;
				moneyCounter += payment;
			}
		} else {
			payment = totalPapers * 0.1;
			moneyCounter += payment;
		}
		String output = "In order to print " + totalPapers + " papers you have to pay: £" + moneyCounter;
		JOptionPane.showMessageDialog(null, output);
	}

}
