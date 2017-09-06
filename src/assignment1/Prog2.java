package assignment1;

/**
 * Assignment 1 problem 2
 * @author 985955
 *
 */
public class Prog2 {

	public static void main(String[] args) {
		
		float var1 = 1.27f;
		float var2 = 3.881f;
		float var3 = 9.6f;
		
		float sum = var1 + var2 + var3;
		int sumInt = (int) sum;
		int sumRound = Math.round(sum);
		
		System.out.println("1. Interger sum: " + sumInt);
		System.out.println("2. Interger sum roundedoff: " + sumRound);

	}

}

//	OUTPUT:-
//	1. Interger sum: 14
//	2. Interger sum roundedoff: 15
