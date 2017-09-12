package assignment4.problem4;

public class Invoice implements Payable {
	private String partNumber, partDescription;
	private Integer quantity;
	private double pricePerItem;
	
	public Invoice(String partNumber, String partDescription, Integer quantity, double pricePerItem) {
		super();
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}

	public String getPartNumber() {
		return partNumber;
	}



	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}



	public String getPartDescription() {
		return partDescription;
	}



	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}



	public Integer getQuantity() {
		return quantity;
	}



	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}



	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}


	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return quantity * pricePerItem;
	}

	@Override
	public String toString() {
		return "Invoice [partNumber=" + partNumber + ", partDescription=" + partDescription + ", quantity=" + quantity
				+ ", pricePerItem=" + pricePerItem + ", getPaymentAmount()=" + getPaymentAmount() + "]";
	}
	
	
}
