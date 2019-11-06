package employmentSimulator;

public class EmploymentSimulatorDemo {

	public static void main(String[] args) {
		EmploymentSimulator es = new EmploymentSimulator();
		
		Person employee1 = new Person("Kacper");
		Person employee2 = new Person("Maciej");
		Person employee3 = new Person("Youma");
		Person employee4 = new Person("Kasia");
		
		es.employ(employee1);
		es.employ(employee2);
		es.employ(employee3);
		es.employ(employee4);
		
		es.companySize();
		es.printEmployees();
		es.makeRedundant();
		es.printNextForTheChop();
		es.printEmployees();
	}

}
