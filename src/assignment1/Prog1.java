package assignment1;

/**
 * Assignment 1 problem 1
 * @author 985955
 *
 */
public class Prog1 {

	public static void main(String[] args) {
		
		final Float pi = (float) Math.PI;
		
		int upper = 9;
		int lower = 1;
		
		int x = RandomNumbers.getRandomInt(lower, upper);
		
		System.out.println("The value of x is " + x);
		
		
		float result = (float) Math.pow(pi, x);
		
		System.out.println("1. The pi power x is " + result);
		
		upper = 14;
		lower = 3;
		
		int y = RandomNumbers.getRandomInt(lower, upper);
		
		System.out.println("\nThe value of y is " + y);
		
		result = (float) Math.pow(y, pi);
		
		System.out.println("2. The y power pi is " + result);

	}

}

//	OUTPUT:-
//	The value of x is 7
//	1. The pi power x is 3020.2937
//	
//	The value of y is 9
//	2. The y power pi is 995.0418
