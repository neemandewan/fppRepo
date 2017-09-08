package assignment3.prob2;

public class Main {
	
	public static Character minChar(String str) {
		if (str == null || str.equals("")) {
			return null;
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
			return minChar(str);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "akel";
		
		System.out.println(minChar(str));

	}

}
