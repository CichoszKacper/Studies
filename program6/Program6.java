package program6;
import javax.swing.JOptionPane;

public class Program6 {

	public static void main(String[] args) {
		String userTemperature;
		userTemperature = JOptionPane.showInputDialog("How many Celsius degrees are right now?");
		float celsiusTemperature = Float.parseFloat(userTemperature);
		float fahrenheitTemperature = ((celsiusTemperature)*9.0f/5.0f) + 32f;
		
		String output = ("There are right now " 
			+ celsiusTemperature +" Celsius degrees. This is equivalent to "
			+fahrenheitTemperature +" Fahrenheit Degrees");
		JOptionPane.showMessageDialog(null, output);
	}

}
