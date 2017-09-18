package assignment7.problem2;
import java.util.*;

public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> aList) {
		//implement
		//compute sum of all salaries of people in aList and return
		
		double sum = 0;
		for(EmployeeData em: aList) {
			sum += em.getSalary();
		}
		return sum;
		
	}
}
