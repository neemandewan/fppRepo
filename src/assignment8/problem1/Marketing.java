package assignment8.problem1;

public class Marketing {
	private String employeeName;
	private String productName;
	private double salesAmount;
	
	public Marketing(String employeeName, String productName, double salesAmount) {
		super();
		this.employeeName = employeeName;
		this.productName = productName;
		this.salesAmount = salesAmount;
	}
	
	

	public double getSalesAmount() {
		return salesAmount;
	}

	
	

	public String getEmployeeName() {
		return employeeName;
	}

	

	public String getProductName() {
		return productName;
	}



	@Override
	public String toString() {
		return  employeeName + " " + productName + " " + salesAmount + "\n";
	}
}
