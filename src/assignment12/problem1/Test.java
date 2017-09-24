package assignment12.problem1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	
	public static void main(String[] args) throws UserException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number: ");
		int num = 0;
		try {
			num = Integer.parseInt(br.readLine());
			if(num < 0) {
				throw new UserException(num);
			}
			
			if(num > 100) {
				throw new UserException();
			}
			
			System.out.println("Value you entered is: " + num);
			
		}catch (UserException e) {
			
			System.err.println(e);
		}finally {
			
			System.out.println("Finally reached with value: " + num);
		}
		
	}
}

/*
	OUTPUT:-
	Enter a number: 10
	Value you entered is: 10
	Finally reached with value: 10
	
	
	Enter a number: -100
	Error: Number is negative.
	assignment12.problem1.UserException
	Finally reached with value: -100
	
	Enter a number: 500
	Error: Non numbers. Enter between range 0 to 100.assignment12.problem1.UserException	
	Finally reached with value: 500

*/
