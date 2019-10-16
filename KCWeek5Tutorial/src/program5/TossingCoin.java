package program5;

import java.util.Random;

import javax.swing.JOptionPane;

public class TossingCoin {

	public static void main(String[] args) {
		print(tossingCoin());
	}
	
	public static String tossingCoin() {
		Random flip = new Random();
		int result = flip.nextInt(2);
		String output;
		if(result == 1) {
			output = "You landed heads.";	
			return output;
		}
		output = "You landed tails";
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
