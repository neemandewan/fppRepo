package assignment4.problem4;

public class SalariedEmployee extends Employee implements Payable {
	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return weeklySalary;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [weeklySalary=" + weeklySalary + ", getPaymentAmount()=" + getPaymentAmount() + "]";
	}
	
	
}
