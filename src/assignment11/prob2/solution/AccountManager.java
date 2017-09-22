package assignment11.prob2.solution;

import java.util.List;

public class AccountManager {

	public static double computeAccountBalanceSum(List<Employee> emps) {
		double sum = 0;
		for(Employee a : emps) {
			List<Account> accounts = a.getAccounts();
			for(Account acc: accounts) {
				sum += acc.getBalance();
			}
		}
		return sum;
	}
}
