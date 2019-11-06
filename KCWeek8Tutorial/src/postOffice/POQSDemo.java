package postOffice;

public class POQSDemo {

	public static void main(String[] args) {
		PostOfficeQueueSimulator poqs = new PostOfficeQueueSimulator();
		
		Person p1 = new Person("Kacper");
		Person p2 = new Person("Maciej");
		Person p3 = new Person("Youma");
		Person p4 = new Person("Kasia");
		
		poqs.add(p1);
		poqs.add(p2);
		poqs.add(p3);
		poqs.add(p4);
		
		poqs.printQueue();
		poqs.whoseAtFront();
		
	}

}
