package assignment3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Prob5 {
	
	@Test
	public void test1() {
		int testArr[] = {1,3,5,7,9};
		Boolean actual = Prob3.binarysearchRecursion(testArr, 0, testArr.length, 7);
		assertEquals(true, actual);
	}
	
	@Test
	public void test2() {
		String str = "MADAM";
		Boolean actual = Prob4.checkPalindrome(str);
		assertEquals(true, actual);
	}
}

/*
	OUTPUT:-
	success
*/
