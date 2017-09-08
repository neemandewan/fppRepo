package assignment2.problem3;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Assignment 2 Problem 3
 * @author Neeman
 *
 */
public class MyDate {
	
	private static DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	private static DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
	private static DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("D yyyy");
	
	public MyDate(int month, int day, int year) {
		System.out.println("\tMonth: " + month + "\t Day: " + day + "\t Year:" + year);
		LocalDate date = LocalDate.of(year, month, day);
		System.out.println("\t" + date.format(formatter1));
		System.out.println("\t" + date.format(formatter2));
		System.out.println("\t" + date.format(formatter3) + "\n");
	}
	
	public MyDate(String month, int day, int year) {
		System.out.println("\tMonth: " + month + "\t Day: " + day + "\t Year:" + year);
		LocalDate date = LocalDate.of(year, Month.valueOf(month), day);
		System.out.println("\t" + date.format(formatter1));
		System.out.println("\t" + date.format(formatter2));
		System.out.println("\t" + date.format(formatter3) + "\n");
	}
	
	public MyDate(int day, int year) {
		System.out.println("\tDay: "+ day + "\t Year:" + year);
		LocalDate date = LocalDate.ofYearDay(year, day);
		System.out.println("\t" + date.format(formatter1));
		System.out.println("\t" + date.format(formatter2));
		System.out.println("\t" + date.format(formatter3) + "\n");
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		LocalDate date = LocalDate.now();
		int val;
		int month, day, year;
		String mon, out;
		
		System.out.println("a. Today date in multiple formats:-");
		System.out.println("\t" + date.format(formatter1));
		System.out.println("\t" + date.format(formatter2));
		System.out.println("\t" + date.format(formatter3) + "\n");
		
		System.out.println("b. overloaded constructors:-");
		new MyDate(date.getMonthValue(), date.getDayOfMonth(), date.getYear());
		new MyDate(date.getMonth().name(), date.getDayOfMonth(), date.getYear());
		new MyDate(date.getDayOfYear(), date.getYear());
		
		int n = 0;
		while(n<1) {
			
			System.out.println("\nEnter 1 for format: MM/DD/YYYY\r\n" + 
					"Enter 2 for format: Month DD, YYYY\r\n" + 
					"Enter 3 for format: DDD YYYY\r\n" + 
					"Enter 4 to exit\n");
			val = sc.nextInt();
			
			sc.nextLine();
			
			while(true) {
				if(val < 1  || val > 4) {
					System.out.println("Invalid input. Please input it again");
					val = sc.nextInt();
					
					if(val > 0 && val < 5 ) {
						break;
					}
				} else {
					break;
				}
			}
			
			switch (val) {
				case 1:

					System.out.println("Enter Month: ");
					month = sc.nextInt();
					
					sc.nextLine();
					
					System.out.println("Enter Day: ");
					day = sc.nextInt();
					
					sc.nextLine();
					
					System.out.println("Enter Year: ");
					year = sc.nextInt();
					
					sc.nextLine();
					
					date = LocalDate.of(year, month, day);
					System.out.println("\tMM/dd/yyyy: " + date.format(formatter1));
					System.out.println("\tMMMM dd,yyyy:" + date.format(formatter2));
					System.out.println("\tDDD yyyy: " + date.format(formatter3) + "\n");
					
					System.out.println("Do you want to Continue (y/n):");
					out = sc.nextLine();
					
					if(out.equals("n")) {
						System.out.println("Terminated");
						n=1;
					}else {
						n=0;
					}
					
					break;
					
				case 2:
					
					System.out.println("Enter Month: ");
					mon = sc.nextLine();
					
					//sc.nextInt();
					
					System.out.println("Enter Day: ");
					day = sc.nextInt();
					
					sc.nextLine();
					
					System.out.println("Enter Year: ");
					year = sc.nextInt();
					
					sc.nextLine();
					
					date = LocalDate.of(year, Month.valueOf(mon.toUpperCase()), day);
					System.out.println("\tMM/dd/yyyy: " + date.format(formatter1));
					System.out.println("\tMMMM dd,yyyy:" + date.format(formatter2));
					System.out.println("\tDDD yyyy: " + date.format(formatter3) + "\n");
					
					System.out.println("Do you want to Continue (y/n):");
					out = sc.nextLine();
					
					if(out.equals("n")) {
						System.out.println("Terminated");
						n=1;
					}else {
						n=0;
					}
					
					break;
					
				case 3:
					
					System.out.println("Enter Days of Year: ");
					day = sc.nextInt();
					
					sc.nextLine();
					
					System.out.println("Enter Year: ");
					year = sc.nextInt();
					
					sc.nextLine();
					
					date = LocalDate.ofYearDay(year, day);
					System.out.println("\tMM/dd/yyyy: " + date.format(formatter1));
					System.out.println("\tMMMM dd,yyyy:" + date.format(formatter2));
					System.out.println("\tDDD yyyy: " + date.format(formatter3) + "\n");
					
					System.out.println("Do you want to Continue (y/n):");
					out = sc.nextLine();
					
					if(out.equals("n")) {
						System.out.println("Terminated");
						n=1;
					}else {
						n=0;
					}
					break;
					
				case 4:
					System.out.println("Terminated");
					n=1;
					
					break;
				default:
					System.out.println("Terminated");
					n=1;
					
					break;
			}
		}
		
		sc.close();
		
	}

}

/*
	OUTPUT:-
	a. Today date in multiple formats:-
	09/08/2017
	September 08, 2017
	251 2017
	
	b. overloaded constructors:-
	Month: 9	 Day: 8	 Year:2017
	09/08/2017
	September 08, 2017
	251 2017
	
	Month: SEPTEMBER	 Day: 8	 Year:2017
	09/08/2017
	September 08, 2017
	251 2017
	
	Day: 251	 Year:2017
	09/08/2017
	September 08, 2017
	251 2017
	
	
	Enter 1 for format: MM/DD/YYYY
	Enter 2 for format: Month DD, YYYY
	Enter 3 for format: DDD YYYY
	Enter 4 to exit
	
	1
	Enter Month: 
	11
	Enter Day: 
	18
	Enter Year: 
	1990
	MM/dd/yyyy: 11/18/1990
	MMMM dd,yyyy:November 18, 1990
	DDD yyyy: 322 1990
	
	Do you want to Continue (y/n):
	Y
	
	Enter 1 for format: MM/DD/YYYY
	Enter 2 for format: Month DD, YYYY
	Enter 3 for format: DDD YYYY
	Enter 4 to exit
	
	2
	Enter Month: 
	september
	Enter Day: 
	18
	Enter Year: 
	1990
	MM/dd/yyyy: 09/18/1990
	MMMM dd,yyyy:September 18, 1990
	DDD yyyy: 261 1990
	
	Do you want to Continue (y/n):
	y
	
	Enter 1 for format: MM/DD/YYYY
	Enter 2 for format: Month DD, YYYY
	Enter 3 for format: DDD YYYY
	Enter 4 to exit
	
	3
	Enter Days of Year: 
	289
	Enter Year: 
	1990
	MM/dd/yyyy: 10/16/1990
	MMMM dd,yyyy:October 16, 1990
	DDD yyyy: 289 1990
	
	Do you want to Continue (y/n):
	n
	Terminated
*/
