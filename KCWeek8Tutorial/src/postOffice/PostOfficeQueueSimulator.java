package postOffice;

import java.util.LinkedList;

public class PostOfficeQueueSimulator {
	
	private LinkedList <Person> PostOfficeQueue = new LinkedList <Person> ();
	
	public void add(Person p) {
		this.PostOfficeQueue.add(p);
	}
	
	public void serve() {
		System.out.println(this.PostOfficeQueue.removeFirst());
	}
	
	public void queueLength() {
		System.out.println(this.PostOfficeQueue.size());
	}
	
	public void printQueue() {
		for(Person tempPerson : PostOfficeQueue){
			System.out.println(tempPerson.getPerson());
		}
	}
	
	public void whoseAtFront() {
		Person tempPerson = this.PostOfficeQueue.peekFirst();
		System.out.println(tempPerson.getPerson());
		
	}
	
	public void whoseAt(int x) {
		System.out.println(this.PostOfficeQueue.get(x-1));
	}

}
	