package assignment7.problem1;

/**
 * 
 * @author 985955
 *
 */
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Person p1 = new Person();
		
		p1.addPerson(new Person("surname1", "Name1", 24));
		p1.addPerson(new Person("surname2", "Name2", 25));
		p1.addPerson(new Person("surname3", "Name3", 26));
		p1.addPerson(new Person("surname4", "Name4", 27));
		p1.addPerson(new Person("surname5", "Name5", 28));
		p1.addPerson(new Person("surname6", "Name6", 28));
		
		Person res = p1.getPerson("surname1");
		System.out.println("Getting surname1: " + res);
		
		res = p1.getPerson("surname3");
		System.out.println("Getting surname3: " + res);
		
		res = p1.getPerson("surname4");
		System.out.println("Getting surname4: " + res);
		
		res = p1.getPerson("surname6");
		System.out.println("Getting surname6: " + res);
		
		res = p1.getPerson("surname7");
		System.out.println("Getting surname7: " + res);
		
	}

}

/*
	OUTPUT:-
	resizing...
	Getting surname1: Person [lastName=surname1 FirstName=Name1 Age=24]
	Getting surname3: Person [lastName=surname3 FirstName=Name3 Age=26]
	Getting surname4: Person [lastName=surname4 FirstName=Name4 Age=27]
	Getting surname6: Person [lastName=surname6 FirstName=Name6 Age=28]
	Getting surname7: null
*/
