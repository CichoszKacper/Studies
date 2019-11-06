package employmentSimulator;

public class Person {
	private String person;
	
	public Person (String person) {
		setPerson(person);
	}

	public String getPerson(){
		return this.person;
	}
	
	public void setPerson(String person) {
		this.person = person;
	}
}
