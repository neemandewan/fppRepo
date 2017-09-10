package assignment3;

public class Prob2 {
	
	public static Character temp = null;
	
	public static Character minChar(String str) {
		Character val;
		if (str == null || str.equals("")) {
			return null;
		}else if(str.length() == 1){
			if(temp != null) {
				return temp;
			}else {
				return str.charAt(0);
			}
		}else {
			val = str.charAt(0);
			if(temp == null) {
				temp = val;
			}else if(val < temp) {
				temp = val;
			}
			str = str.substring(1);
			
			// Recursion goes here
			return minChar(str);
		}
	}
	
	public static void main(String[] args) {
		String str1 = "yuiopsqbnc";
		String str2 = "akel";
		
		System.out.println("Min Character for " + str1 + " is " + minChar(str1));
		System.out.println("Min Character for " + str2 + " is " + minChar(str2));

	}

}

/*
	OUTPUT:-
	Min Character for yuiopsqbnc is b
	Min Character for akel is a

*/
