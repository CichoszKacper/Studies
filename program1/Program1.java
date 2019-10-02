package program1;
import javax.swing.JOptionPane;
public class Program1 {

	public static void main(String[] args) {
		int myAge = 28;
		String userAge;
		
		userAge = JOptionPane.showInputDialog("please enter you age");
		int age = Integer.parseInt(userAge);
		int ageDiff =  age - myAge;
		String output = ("Age difference is " + ageDiff);
		
		JOptionPane.showMessageDialog(null,output);

	}

}
