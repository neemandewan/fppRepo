package assignment8.problem1;

import java.util.Comparator;

public class SalesAmountComparator implements Comparator<Marketing> {

	@Override
	public int compare(Marketing o1, Marketing o2) {
		// TODO Auto-generated method stub
		if(Double.compare(o1.getSalesAmount(), o2.getSalesAmount()) != 0) {
			
			return Double.compare(o1.getSalesAmount(), o2.getSalesAmount());
		}
		
		if(o1.getEmployeeName().compareTo(o2.getEmployeeName()) != 0) {
			
			return o1.getEmployeeName().compareTo(o2.getEmployeeName());
		}
		
		return o1.getProductName().compareTo(o2.getProductName());
	}

}
