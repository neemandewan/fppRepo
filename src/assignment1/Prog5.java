package assignment1;

/**
 * Assignment 1 Problem 5
 * @author 985955
 *
 */
public class Prog5 {

	public static void main(String[] args) {
		
		int r1, r2, r3, r4, i;
		int upper = 99;
		int lower = 1;
		int[][] mArray = new int[4][4];
		for(i = 0; i<mArray.length; i++) {
			int[] mrArray = new int[4];
			r1 = RandomNumbers.getRandomInt(lower, upper);
			r2 = RandomNumbers.getRandomInt(lower,upper);
			r3 = RandomNumbers.getRandomInt(lower,upper);
			r4 = RandomNumbers.getRandomInt(lower,upper);
			
			mrArray[0] = r1;
			mrArray[1] = r2;
			mrArray[2] = r3;
			mrArray[3] = r4;
			
			mArray[i] = mrArray;
		
		}
		
		for(i=0; i<mArray.length; i++){
			if(i%2 == 0) {
				System.out.println("  " + mArray[i][0] + "\t" + "  " + mArray[i][1] + "\t" + "  " + mArray[i][2] + "\t" + "  " + mArray[i][3]);
			}else {
				System.out.println("+ " + mArray[i][0] + "\t" + "+ " + mArray[i][1] + "\t" + "+ " + mArray[i][2] + "\t" + "+ " + mArray[i][3]);
				System.out.println("  __" + "\t" + "  __" + "\t" + "  __" + "\t" + "  __");
				System.out.println("\n");
			}
			
		}
	}

}

// 	OUTPUT:-
//  49	  84	  48	  3
// + 7	  + 1	+ 24	+ 55
//  __	  __	  __	  __
//
//
//   31	  93	  87	  92
// + 29	+ 15	+ 58	+ 96
//   __	  __	  __	  __

