package assignment1;

import java.util.Arrays;

/**
 * Assignment 1 Problem 6
 * @author 985955
 *
 */
public class Prog6 {

	public static void main(String[] args) {
		
		String[] a = new String[]{"horse", "dog", "cat", "horse","dog"};
		String[] b = new String[a.length];
		int count = 0;
		for(int i=0; i<a.length; i++) {
			int present = 0;
			for(int j=0; j<b.length; j++) {
				if(b[j] == (a[i])) {
					present=1;
				}
			}
			
			if(present<1) {
				b[i] = a[i];
				count++;
			}
		}
		
		b = Arrays.copyOf(b, count);
		
		System.out.println("Result: " + Arrays.toString(b));

	}

}

// 	OUTPUT :-
//	Result: [horse, dog, cat]