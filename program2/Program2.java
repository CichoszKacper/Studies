package program2;
import javax.swing.JOptionPane;

public class Program2 {

	public static void main(String[] args) {
		String myAge;
		myAge = JOptionPane.showInputDialog("How old are you?");
		int yourAge = Integer.parseInt(myAge);
		int result = yourAge/2;
		String output = ("Your age divided by 2 equals " + result);
		JOptionPane.showMessageDialog(null,output);
	}

}
