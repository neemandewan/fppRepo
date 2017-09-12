package assignment4.problem6.deep;

public class Person implements Cloneable {
	private String name;
	private Computer computer;
	
	public Person(String name, Computer computer) {
		super();
		this.name = name;
		this.computer = computer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Computer getComputer() {
		return computer;
	}
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Person p = (Person) super.clone();
		p.computer = (Computer) this.computer.clone();
		
		return p;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", computer=" + computer + "]";
	}
	
}

/*
	OUTPUT:-
	Before copying person1, person1: 
	Person [name=person1, computer=Computer [manufacturer: Dell, processor: i7, ramSize: 16, diskSize: 2, processorSpeed: 3122.77]]
	After copying person1, person2: 
	Person [name=person1, computer=Computer [manufacturer: Dell, processor: i7, ramSize: 16, diskSize: 2, processorSpeed: 3122.77]]
	
	Edited value of computer in person1
	new values of person1: 
	Person [name=person1, computer=Computer [manufacturer: HP, processor: i7, ramSize: 16, diskSize: 2, processorSpeed: 3122.77]]
	Changed value due to shallow copy in person2: 
	Person [name=person1, computer=Computer [manufacturer: Dell, processor: i7, ramSize: 16, diskSize: 2, processorSpeed: 3122.77]]

*/
