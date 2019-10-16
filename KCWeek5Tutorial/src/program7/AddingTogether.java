package program7;

import javax.swing.JOptionPane;

public class AddingTogether {

	public static void main(String[] args) {
		String output = "";
		output += addTogether(20, 50, 70) + "\n";
		output += addTogether(20.0, 50.0, 70.0) + "\n";
		output += addTogether("20", "50", "70") + "\n";
		print(output);
	}
	public static int addTogether(int num1, int num2,int num3){
		return num1+num2+num3;
	}
	public static double addTogether(double num1, double num2,double num3){
		return num1+num2+num3;
	}
	public static String addTogether(String num1, String num2,String num3){
		return num1+num2+num3;
	}
	public static void print(String output) {
		JOptionPane.showMessageDialog(null, output);
	}//end print

}
