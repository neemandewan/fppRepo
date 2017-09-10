package assignment3;

public class Prob1 {
	
	public static String sortStrings(String str) {
		if (str == null || str.equals("")) {
			return "";
		}else if(str.length() == 1){
			return str;
		}else {
			String temp = str.substring(0);
			int pos = 0;
			for(int i=0; i<str.length(); i++) {
				if(str.substring(i, i+1).compareTo(temp)<0) {
					temp = str.substring(i, i+1);
					pos = i;
				}
			}
			
			str = str.substring(0, pos) + str.substring(pos + 1);
			
			//Recursion goes here
			return temp + sortStrings(str);
		}
	}

	public static void main(String[] args) {		
		String s1 = "aerz";
		String s2 = "aaby";
		
		String s3 = "ace";
		String s4 = "bdf";
		
		System.out.println(s1 + " and " + s2 + " sort string is " + sortStrings(s1+s2));
		System.out.println(s3 + " and " + s4 + " sort string is " + sortStrings(s3+s4));
		
	}

}

/*
	OUTPUT:-
	aerz and aaby sort string is aaaberyz
	ace and bdf sort string is abcdef
*/
