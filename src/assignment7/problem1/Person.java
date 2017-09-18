package assignment7.problem1;


public class Person {
	private String lastName;
	private String firstName;
	private int age;
	
	private Person[] person;
	private final int INITIAL_LENGTH = 4;
	private int size;
	
	public Person() {
		person = new Person[INITIAL_LENGTH];
		size = 0;
	}

	public Person(String lastName, String firstName, int age) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
	}
	
	public void addPerson(Person p) {
		if(size == person.length) resize();
		person[size++] = p;
	}
	
	public String getLast() {	// get last name
		return lastName;
	}
	
	private void resize() {
		System.out.println("resizing...");
		int len = person.length;
		int newlen = 2*len;
		Person[] temp = new Person[newlen];
		System.arraycopy(person, 0, temp, 0, len);
		//Arrays.copyOf(person, temp);
		person = temp;
	}
	
	public Person getPerson(String lastName) {
		System.out.println(person.length);
		
		for(Person p: person) {
			if(p.getLast().equals(lastName)) {
				return p;
			}
		}
		
		return null;
	}
	
	public int size() {
		return size;
	}

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + " FirstName=" + firstName + " Age=" + age + "]";
	}
}
