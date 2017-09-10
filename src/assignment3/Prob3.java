package assignment3;

import java.util.Arrays;

public class Prob3 {
	
	public static boolean binarysearchRecursion(int[] array, int beginIndex, int endIndex, int searchEl) {
		
		try {
			
			if(beginIndex > endIndex)
				return false;
			
			int mid = (beginIndex + endIndex) / 2;
			
			if (array[mid] > searchEl) {
	            return binarysearchRecursion(array, beginIndex, mid - 1, searchEl );
	        } else if (array[mid] < searchEl) {
	            return binarysearchRecursion(array, mid + 1 , endIndex, searchEl);
	        } else {
	            return true;
	        }
			
		} catch(ArrayIndexOutOfBoundsException e) {
			// Send false if value is greater than one present on the integer arrays
			return false;
		}
			
	}

	public static void main(String[] args) {
		int[] a = new int[] {2, 4, 6, 8, 9, 11, 15, 18, 23, 31, 37, 45};
		int input1 = 43;
		int input2 = 45;
		System.out.println("Data input: " + Arrays.toString(a));
		System.out.println("Result for "+ input1 + " is: " + binarysearchRecursion(a, 0, a.length, input1));
		System.out.println("Result for "+ input2 + " is: " + binarysearchRecursion(a, 0, a.length, input2));
	}

}

/*
	OUTPUT:-
	Data input: [2, 4, 6, 8, 9, 11, 15, 18, 23, 31, 37, 45]
	Result for 43 is: false
	Result for 45 is: true
*/
