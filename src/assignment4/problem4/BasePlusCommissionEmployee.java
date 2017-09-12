package assignment4.problem4;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;
	
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public double getBasePlusCommissionEmployee() {
		return baseSalary + (super.getGrossSales() * super.getCommissionRate());
	}

	@Override
	public String toString() {
		return "BasePlusCommissionEmployee [baseSalary=" + baseSalary + ", getBasePlusCommissionEmployee()="
				+ getBasePlusCommissionEmployee() + "]";
	}
	
}
