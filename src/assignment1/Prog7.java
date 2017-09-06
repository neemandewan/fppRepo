package assignment1;

/**
 * Assignment 1 Problem 7
 * @author 985955
 *
 */
public class Prog7 {

	public static void main(String[] args) {
		// args = JAVA FPP MPP C# ANDROID ANDENGINE
		int count = 0;
		String str;
		for(String s: args) {
			System.out.println("Length of "+ s +": " + s.length());
			str = s.substring(0,1);
			if(str.equals("A")){
				count++;
			}
		}
		
		System.out.println("Strings started with Letter A: " + count);

	}

}

//	OUTPUT:-
//	Length of JAVA: 4
//	Length of FPP: 3
//	Length of MPP: 3
//	Length of C#: 2
//	Length of ANDROID: 7
//	Length of ANDENGINE: 9
//	Strings started with Letter A: 2
