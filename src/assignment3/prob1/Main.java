package assignment3.prob1;

public class Main {
	
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
			
			System.out.print(temp);
			str = str.substring(0, pos) + str.substring(pos + 1);
			return sortStrings(str);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "aerz";
		String s2 = "aaby";
		
		String s = sortStrings(s1+s2);
		System.out.println(s);
		
	}

}
