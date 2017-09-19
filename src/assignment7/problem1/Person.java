package assignment7.problem1;

import java.util.Arrays;

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
		//System.arraycopy(person, 0, temp, 0, len);
		temp = Arrays.copyOf(person, newlen);
		person = temp;
	}
	
	public Person getPerson(String lastName) {
		for(Person p: person) {
			if(p == null) return p;
			if(p.getLast().equals(lastName)) {
				return p;
			} 
		}
		
		return null;
	}
	
	public int size() {
		return size;
	}
	
	public boolean find(String s){
		for(Person p : person){
			if(p.getLast().equals(s)) return true;
		}
		return false;
	}
	
	public void insert(Person per, int pos){
		if(pos > size) return;
		if(pos >= person.length||size+1 > person.length) {
			resize();
		}
		Person[] temp = new Person[person.length+1];
		System.arraycopy(person,0,temp,0,pos);
		temp[pos] = per;
		
		System.arraycopy(person,pos,temp,pos+1, person.length - pos);
		person = temp;
		++size;
		
	}
	
	public boolean remove(String s){
		if(size == 0) return false;
		int index = -1;
		for(int i = 0; i < size; ++i ){
			if(person[i].getLast().equals(s)){
				index = i;
				break;
			}
		}
		if(index==-1) return false;
		Person[] temp = new Person[person.length];
		System.arraycopy(person,0,temp,0,index);
		System.arraycopy(person,index+1,temp,index,person.length-(index+1));
		person = temp;
		--size;
		return true;
	}

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + " FirstName=" + firstName + " Age=" + age + "]";
	}
}
