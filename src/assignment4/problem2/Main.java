package assignment4.problem2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Professor professor1 = new Professor("Name 1", 5000, LocalDate.of(2000, 10, 24), 3);
		Professor professor2 = new Professor("Name 2", 6000, LocalDate.of(1999, 5, 18), 10);
		Professor professor3 = new Professor("Name 3", 7000, LocalDate.of(1995, 6, 2), 15);
		
		Secretary secretary1 = new Secretary("Name 4", 3000, LocalDate.of(2001, 12, 15), 8.32);
		Secretary secretary2 = new Secretary("Name 5", 4000, LocalDate.of(2002, 11, 29), 9.15);
		
		DeptEmployee[] department = new DeptEmployee[5];
		department[0] = professor1;
		department[1] = professor2;
		department[2] = professor3;
		
		department[3] = secretary1;
		department[4] = secretary2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to see the sum of all Professor salary, sum of all secretary salary and all salaries in the department");
		
		String res = sc.nextLine();
		Boolean showSum = false;
		if(res.toLowerCase().equals("y")) {
			showSum = true;
		}
		
		show(department, showSum);
		
		sc.close();
	}
	
	public static void show(DeptEmployee[] ob, Boolean showSum){
		double sum = 0;
		String s;
		
		for(DeptEmployee d: ob) {
			s = d.getClass().getSimpleName();
			
			if(s.toLowerCase().equals("professor")) {
				System.out.println("Salary of Prof. " + d.getName() + " is " + d.computeSalary());
			} else {
				System.out.println("Salary of Secr. " + d.getName() + " is " + d.computeSalary());
			}
			
			sum += d.computeSalary();
		}
		
		if(showSum.equals(true)) {
			System.out.println("\nTotal salary: " + sum);
		}
	}

}

/*
	OUTPUT:- 
	Do you want to see the sum of all Professor salary, sum of all secretary salary and all salaries in the department
	Y
	Salary of Prof. Name 1 is 5000.0
	Salary of Prof. Name 2 is 6000.0
	Salary of Prof. Name 3 is 7000.0
	Salary of Secr. Name 4 is 3099.84
	Salary of Secr. Name 5 is 4109.8
	
	Total salary: 25209.64
	
	Do you want to see the sum of all Professor salary, sum of all secretary salary and all salaries in the department
	N
	Salary of Prof. Name 1 is 5000.0
	Salary of Prof. Name 2 is 6000.0
	Salary of Prof. Name 3 is 7000.0
	Salary of Secr. Name 4 is 3099.84
	Salary of Secr. Name 5 is 4109.8
*/
