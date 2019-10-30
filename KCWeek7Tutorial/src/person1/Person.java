package person1;

import javax.swing.JOptionPane;

public class Person {
	private String name;
	static int counter = 0;
	private int age;
	private String address;
	
	public Person() {
		this("unknown", "unknown", 0);
	}
	
	public Person(String name, String address, int age){
		setName(name);
		setAddress(address);
		setAge(age);
		counter++;
	}
	
	public Person(String name, int age){
		this(name, "unknown", age);
	}
	
	public Person(String name, String address){
		this(name, address, 0);
	}
	
	public Person(int age){
		this("unknown", "unknown", age);
	}	
	
	public String toString(){
		String output;
		output = "Name is: " + this.name + "\n";
		output += "Address is: " + this.address + "\n";
		output += "Age is: " + this.age;
	
		return output;
	}
	
	public void happyBirthday(){
		//this.age = this.age + 1;
		setAge(this.age+1);
	}
	
	public void printDetails(){	
		String output;
		output = toString();
		print(output);
	}
	public int getAge(){
		return this.age;	
	}
	public String getName(){
		return this.name;
	}
	public String getAddress(){
		return this.address;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAddress(String address){
		this.address = address;
	}
	
	
	public static void print(String output) {
		JOptionPane.showMessageDialog(null, output);
	}//end print
	
	public static int input(String name) {
		int result = Integer.parseInt((JOptionPane.showInputDialog(name)));
		return result;
	}//end input		
}
