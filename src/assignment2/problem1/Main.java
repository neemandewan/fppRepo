package assignment2.problem1;

/**
 * Assignment 2 Problem 1
 * @author Neeman
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer[] customers = new Customer[3];
		Customer customer;
		Address address;
		
		for(int i=1; i<4; i++) {
			customer = new Customer();
			customer.setFirstName("FirstName" + i);
			customer.setLastName("LastName" + i);
			customer.setSocSecurityNum("21A345" + i);
			
			address = new Address();
			
			if(i == 1 || i==2) {
				address.setCity("Chicago");
			}else {
				address.setCity("City" + 1);
			}
			
			address.setState("State" + i);
			address.setStreet("Street" + i);
			address.setZip("522" + i);
			
			customer.setBillingAddress(address);
			customer.setShippingAddress(address);
			
			customers[i-1] = customer;
		}
		
		for(Customer c: customers) {
			if(c.getBillingAddress().getCity().equals("Chicago")) {
				System.out.println(c.toString());
			}
		}

	}

}
