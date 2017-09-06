package assignment1;

import java.util.Scanner;

/**
 * Assignment 1 Problem 4
 * @author 985955
 *
 */
public class Prog4 {

	public static void main(String[] args) {
		
		Scanner in  = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String strOr = in.nextLine();
		
		in.close();
		
		for(int i=strOr.length()-1; i>=0; i--){
			// output is directly printed as we are not allowed to save in a new string... 
			System.out.print(strOr.charAt(i));
		}
	}

}


// 	OUTPUT:-
//	Enter the string: this is demo
//	omed si siht