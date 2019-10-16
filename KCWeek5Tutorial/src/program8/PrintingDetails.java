package program8;

import javax.swing.JOptionPane;

public class PrintingDetails {

	public static void main(String[] args) {
		printDetails("Kacper","Harvesters Way 76/9", 28);

	}
	public static void printDetails(String name, String address, int age){
		String output = "Dear " + name + ".\nYour address is: " + address + ".\nYour age is: " + age + ".";
		print(output);
	}
	public static void printDetails(String name, String address){
		String output = "Dear " + name + ".\nYour address is: " + address + ".";
		print(output);
	}
	public static void printDetails(String name,int age){
		String output = "Dear " + name + ".\nYour address is: " + ".\nYour age is: " + age + ".";
		print(output);
	}
	public static void print(String output) {
		JOptionPane.showMessageDialog(null, output);
	}//end print

}
