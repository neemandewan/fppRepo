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
		
		p1.addPerson(new Person("Rai", "Nibesh", 24));
		p1.addPerson(new Person("Rai1", "Nibesh1", 25));
		p1.addPerson(new Person("Rai2", "Nibesh2", 26));
		p1.addPerson(new Person("Rai3", "Nibesh3", 27));
		p1.addPerson(new Person("Rai4", "Nibesh4", 28));
		
		Person res = p1.getPerson("Rai1");
		System.out.println(res);
		
		res = p1.getPerson("Rai3");
		System.out.println(res);
		
		res = p1.getPerson("Rai4");
		System.out.println(res);
		
		res = p1.getPerson("Rai9");
		System.out.println(res);
		
		//res = p1.getPerson("Rai8");
		//System.out.println(res);
	}

}
