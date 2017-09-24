package assignment12.problem2;

@SuppressWarnings("serial")
public class UserException extends Exception {
	
	public UserException() {
		System.out.println("Exception: Withdraw amount exceed the balance");
	}
	
	public UserException(String str) {
		System.out.println("Exception: Balance reach below 100$");
	}
}
