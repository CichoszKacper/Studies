package program6;

import java.util.Random;

import javax.swing.JOptionPane;

public class TossingCoin1000 {

	public static void main(String[] args) {
		print(tossingCoin());
	}
	
	public static String tossingCoin() {
		Random flip = new Random();
		String output;
		int numberOfHeads = 0;
		int numberOfTails = 0;
		int counter = 0;
		while(counter<1000) {
			int result = flip.nextInt(2);
			if(result==1){
				numberOfHeads++;
			}else {
				numberOfTails++;
			}
			counter++;				
		}
		output = "Number of heads: " + numberOfHeads + "\nNumber of tails: " + numberOfTails;
		return output;
		
	}
	
	public static void print(String output) {
		JOptionPane.showMessageDialog(null, output);
	}//end print
	
	public static int input(String name) {
		int result = Integer.parseInt((JOptionPane.showInputDialog(name)));
		return result;
	}//end input
}
