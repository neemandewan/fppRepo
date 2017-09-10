package assignment3;

public class Prob4 {
	
	// Recursion method
	public static String reverseString(String str) {
		if ((str == null) || (str.length() <= 1)) {
	        return str;
	    }
	    return reverseString(str.substring(1)) + str.charAt(0);
	}
	
	// Check Palindrome
	public static boolean checkPalindrome(String str) {
		String revStr = reverseString(str);
		if(str.equals(revStr))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		String a = "MADAM";
		System.out.println("Result for " + a + " is " + checkPalindrome(a));
		
		String b = "WOMEN";
		System.out.println("Result for " + b + " is " + checkPalindrome(b));
	}
}

/*
	OUTPUT:-
	Result for MADAM is true
	Result for WOMEN is false
*/
