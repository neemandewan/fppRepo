package assignment2.problem1;

/**
 * Assignment 2 Problem 1
 * @author Neeman
 *
 */
public class Customer {
	private String  firstName, lastName,socSecurityNum;
	private Address billingAddress,shippingAddress;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSocSecurityNum() {
		return socSecurityNum;
	}
	public void setSocSecurityNum(String socSecurityNum) {
		this.socSecurityNum = socSecurityNum;
	}
	public Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	public Address getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	
	public String toString() {
		return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum
		+ "]";
	}
}
