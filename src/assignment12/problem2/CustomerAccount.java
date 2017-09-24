package assignment12.problem2;

public class CustomerAccount {
	private String  Cus_name, Acc_No;
	private double balance;
	
	public CustomerAccount(String cus_name, String acc_No, double balance) {
		super();
		Cus_name = cus_name;
		Acc_No = acc_No;
		this.balance = balance;
	}
	public String getCus_name() {
		return Cus_name;
	}
	public void setCus_name(String cus_name) {
		Cus_name = cus_name;
	}
	public String getAcc_No() {
		return Acc_No;
	}
	public void setAcc_No(String acc_No) {
		Acc_No = acc_No;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		System.out.println("Depositing: " + amount);
		balance += amount;
	}
	
	public void withdraw(double amount) throws UserException {
		System.out.println("Withdrawing: " + amount);
		if(amount > balance) {
			throw new UserException();
		} else {
			balance -= amount;
			System.out.println(balance);
			
			if(balance < 100) {
				throw new UserException("Balance reach below 100$");
			}
		}
	}
	
	@Override
	public String toString() {
		return "CustomerAccount [Cus_name=" + Cus_name + ", Acc_No=" + Acc_No + ", Balance=" + balance + "]";
	}
	
	
	
}
