package assignment4.problem4;

public class CommissionEmployee extends Employee implements Payable{
	private double grossSales, commissionRate;

	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return grossSales*commissionRate;
	}

	@Override
	public String toString() {
		return "CommissionEmployee [grossSales=" + grossSales + ", commissionRate=" + commissionRate
				+ ", getPaymentAmount()=" + getPaymentAmount() + "]";
	}
	
	
}
