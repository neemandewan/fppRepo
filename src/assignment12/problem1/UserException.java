package assignment12.problem1;

@SuppressWarnings("serial")
public class UserException extends Exception {
	
	public UserException() {
		// TODO Auto-generated constructor stub
		System.out.println("Error: Non numbers. Enter between range 0 to 100.");
	}
	
	public UserException(int a) {
		System.out.println("Error: Number is negative.");
	}
}
