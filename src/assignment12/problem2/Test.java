package assignment12.problem2;

public class Test {

	public static void main(String[] args) throws UserException {
		// TODO Auto-generated method stub
		
		CustomerAccount account = new CustomerAccount("Prabhab", "AN087654", 300.0);
		System.out.println(account);
		
		account.deposit(200);
		System.out.println(account);
		
		try {
			account.withdraw(450);
			System.out.println(account);
			
		}catch(UserException e) {
			
		} finally {
			System.out.println(account);
			
			try {
				account.withdraw(1000);
			}catch(UserException e) {
				
			} finally {
				System.out.println(account);
			}
			
		}
		
	}

}

/*
	OUTPUT:-
	CustomerAccount [Cus_name=Prabhab, Acc_No=AN087654, Balance=300.0]
	Depositing: 200.0
	CustomerAccount [Cus_name=Prabhab, Acc_No=AN087654, Balance=500.0]
	Withdrawing: 450.0
	50.0
	Exception: Balance reach below 100$
	CustomerAccount [Cus_name=Prabhab, Acc_No=AN087654, Balance=50.0]
	Withdrawing: 1000.0
	Exception: Withdraw amount exceed the balance
	CustomerAccount [Cus_name=Prabhab, Acc_No=AN087654, Balance=50.0]
*/