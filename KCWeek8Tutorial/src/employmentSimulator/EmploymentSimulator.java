package employmentSimulator;

import java.util.LinkedList;

public class EmploymentSimulator {
	private LinkedList <Person> EmploymentSimulator = new LinkedList <Person> ();
	
	public void employ(Person p){
		this.EmploymentSimulator.add(p);
	}
	
	public void makeRedundant(){
		System.out.println(this.EmploymentSimulator.removeLast().getPerson());
	}
	
	public void printNextForTheChop (){
		System.out.println(this.EmploymentSimulator.getLast().getPerson());
	}
	
	public void companySize(){
		System.out.println(this.EmploymentSimulator.size());
	}
	
	public void printEmployees(){
		for(Person tempEmployee : EmploymentSimulator){
			System.out.println(tempEmployee.getPerson());
		}
	}
}
