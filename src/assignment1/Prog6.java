package assignment1;

import java.util.Arrays;

/**
 * Assignment 1 Problem 6
 * @author 985955
 *
 */
public class Prog6 {

	public static void main(String[] args) {
		removeDups();
	}
	
	public static void removeDups() {
		String[] a = new String[]{"horse", "horse", "dog", "dog", "cat", "horse","dog", "elephant"};
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
				count++;
				for(int k = 0; k<b.length; k++) {
					if(b[k] == null) {
						b[k] = a[i];
						break;
					}
				}
			}
		}
		
		b = Arrays.copyOf(b, count);
		
		System.out.println("Result: " + Arrays.toString(b));
	}

}

// 	OUTPUT :-
//	Result: [horse, dog, cat]