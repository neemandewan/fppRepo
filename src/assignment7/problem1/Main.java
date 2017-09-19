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
		System.out.println(res);
		
		res = p1.getPerson("surname3");
		System.out.println(res);
		
		res = p1.getPerson("surname4");
		System.out.println(res);
		
		res = p1.getPerson("surname6");
		System.out.println(res);
		
		res = p1.getPerson("surname7");
		System.out.println(res);
		
	}

}

/*
	OUTPUT:-
	resizing...
	Person [lastName=surname1 FirstName=Name1 Age=24]
	Person [lastName=surname3 FirstName=Name3 Age=26]
	Person [lastName=surname4 FirstName=Name4 Age=27]
	Person [lastName=surname6 FirstName=Name6 Age=28]
	null
*/
