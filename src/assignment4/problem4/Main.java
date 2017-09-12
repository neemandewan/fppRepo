package assignment4.problem4;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payable[] pay = new Payable[5];
		pay[0] = new BasePlusCommissionEmployee("FirstName 1", "LastName 1", "31245AD456", 11.55, 30, 3000);
		pay[1] = new CommissionEmployee("FirstName 1", "LastName 1", "31245AD456", 40, 50);
		pay[2] = new HourlyEmployee("FirstName 1", "LastName 1", "31245AD456", 3000, 5);
		pay[3] = new SalariedEmployee("FirstName 1", "LastName 1", "31245AD456", 4000);
		pay[4] = new Invoice("AA00", "Computer", 5, 1200);
		
		show(pay);
		
	}
	
	public static void show(Payable[] ob) {
		
		double sum = 0;
		
		for(Payable pay: ob) {
			System.out.println(pay);
			sum += pay.getPaymentAmount();
		}
		
		System.out.println("\nTotal SUM: " + sum);
	}
}

/*
	OUTPUT:-
	
	BasePlusCommissionEmployee [baseSalary=3000.0, getBasePlusCommissionEmployee()=3346.5]
	CommissionEmployee [grossSales=40.0, commissionRate=50.0, getPaymentAmount()=2000.0]
	HourlyEmployee [wage=3000.0, hours=5.0, getPaymentAmount()=15000.0]
	SalariedEmployee [weeklySalary=4000.0, getPaymentAmount()=4000.0]
	Invoice [partNumber=AA00, partDescription=Computer, quantity=5, pricePerItem=1200.0, getPaymentAmount()=6000.0]
	
	Total SUM: 27346.5
*/
