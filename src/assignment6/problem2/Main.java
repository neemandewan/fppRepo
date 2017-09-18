package assignment6.problem2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('w',"Willie");
		
		
		t.add('a', "Annie");
		
		System.out.println(t);
		
		String s = t.get('w');
		System.out.println(s);
	}

}

/*
 	OUTPUT:-
 	a -> Annie
	b -> Billy
	w -> Willie
	
	w -> Willie

*/