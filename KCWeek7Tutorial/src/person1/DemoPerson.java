package person1;

public class DemoPerson {

	public static void main(String[] args) {
		Person p1 = new Person ("Kacper", "Harvesters Way", 28);
		Person p2 = new Person ("Youma", "Harvesters Way", 29);
		Person p3 = new Person ("Maciej", "Sikorskiego", 25);

		
		Person [] people = new Person[3];
		people[0] = p1;
		people[1] = p2;
		people[2] = p3;
		for(int i=0;i<people.length;i++){
			people[i].printDetails();	
		}
		
		Person p4 = new Person("Bogdan", 38);
		Person p5 = new Person("Zygmunt", "Wiejska");
		Person p6 = new Person(64);
		p4.printDetails();
		p5.printDetails();
		p6.printDetails();
		
		Person p7 = new Person ();
		p7.printDetails();
		
		Person.counter;
	}

}
