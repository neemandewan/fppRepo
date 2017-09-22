package assignment11.prob2.solution;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Account rAccount1 = new RetirementAccount(50000, null);
		Account rAccount2 = new RetirementAccount(40000, null);
		Account rAccount3 = new RetirementAccount(30000, null);
		Account rAccount4 = new RetirementAccount(90000, null);
		Account sAccount1 = new SavingsAccount(80000, .05);
		Account sAccount3 = new SavingsAccount(120000, .07);
		Account sAccount4 = new SavingsAccount(60000, .03);
		Account cAccount2 = new CheckingAccount(70000);
		Account cAccount3 = new CheckingAccount(30000);
		Account cAccount4 = new CheckingAccount(45000);
		
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("12", Arrays.asList(rAccount1, sAccount1)));
		emps.add(new Employee("31", Arrays.asList(rAccount2, cAccount2)));
		emps.add(new Employee("42", Arrays.asList(rAccount3, cAccount3, sAccount3)));
		emps.add(new Employee("33", Arrays.asList(rAccount4, sAccount4, cAccount4)));
		
		double sum = AccountManager.computeAccountBalanceSum(emps);
		
		System.out.println(sum);
	}

}

/*
	OUTPUT:-
	629000.0
*/