package program1;

import javax.swing.JOptionPane;

public class Welcome {

	public static void main(String[] args) {
		welcome();
	}
	
	public static void welcome() {
		String output = "Hello";
		JOptionPane.showMessageDialog(null, output);
	}

}
