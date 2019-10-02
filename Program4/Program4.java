package Program4;
import javax.swing.JOptionPane;

public class Program4 {

	public static void main(String[] args) {
		String userAge;
		userAge = JOptionPane.showInputDialog("How old are you?");
		int age = Integer.parseInt(userAge);
		String output = ("You will be "+(age+1)+" this time next year");
		JOptionPane.showMessageDialog(null,output);

	}

}
