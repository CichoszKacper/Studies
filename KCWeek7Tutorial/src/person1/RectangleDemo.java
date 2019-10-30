package person1;

import javax.swing.JOptionPane;

public class RectangleDemo {

	public static void main(String[] args) {
		String output;
		Rectangle r1 = new Rectangle(6,5);
		boolean value = r1.isSquare();
		output = "Your rectangle is square: " + value + ". Counter = " + Rectangle.counter;
		print(output);
		
		
	}
	
	public static void print(String output) {
		JOptionPane.showMessageDialog(null, output);
	}//end print

}
