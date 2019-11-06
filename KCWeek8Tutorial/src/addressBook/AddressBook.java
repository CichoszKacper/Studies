package addressBook;

import java.util.Map.Entry;
import java.util.TreeMap;

import javax.swing.JOptionPane;

public class AddressBook {
	private TreeMap <String,String> AddressBook = new TreeMap <String,String> ();
	
	public void addEntry(){
		String name = stringInput("Enter your name: ");
		String address = stringInput("Enter your address: ");
		addEntry(name,address);
		this.AddressBook.put(name, address);
	}
	
	public void addEntry(String name, String address){
		this.AddressBook.put(name, address);
	}
	
	public void deleteEntry(){
		String key = stringInput("Enter key to delete: ");
		deleteEntry(key);
		this.AddressBook.remove(key);
	}
	
	public void deleteEntry(String key){
		this.AddressBook.remove(key);
	}
	
	public void displayContents(){
		String output = "";
		for(Entry<String, String> entry  : AddressBook.entrySet()){
			output += entry.getKey() + ": " + entry.getValue() + "\n";
		}
		print(output);	
	}
	
	public void go(){
		String output;
		output = "Select: \n";
		output += "1 - Add new entry.\n";
		output += "2 - Delete selected entry.\n";
		output += "3 - Display contents.\n";
		output += "4 - Exit.";
		int userInput;
		do{
			userInput = intInput(output);
			
			if(userInput == 1){
				addEntry();
			}
			if(userInput == 2){
				deleteEntry();
			}
			if(userInput == 3){
				displayContents();
			}
		}while(userInput!=4);
	}
	
	public static void print(String output) {
		JOptionPane.showMessageDialog(null, output);
	}//end print
	
	public static int intInput(String name) {
		int result = Integer.parseInt((JOptionPane.showInputDialog(name)));
		return result;
	}//end intInput
	
	public static String stringInput(String name) {
		String result = JOptionPane.showInputDialog(name);
		return result;
	}//end stringInput
}
