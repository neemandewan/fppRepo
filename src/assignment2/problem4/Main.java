package assignment2.problem4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch;
		Scanner sc = new Scanner(System.in);
		Double result;
		System.out.println("Enter C for Circle" + 
							"\nEnter R for Rectangle" +
							"\nEnter T for Triangle");
		ch = sc.nextLine();
		switch(ch.toLowerCase()) {
			case "c":
				
				System.out.println("Enter the radius of the circle: ");
				double rd = sc.nextInt();
				
				Circle cr = new Circle(rd);
				result = cr.computeArea();
				
				System.out.println("The area of Circle is : " + result);
				
				break;
			case "r":
				
				System.out.println("Enter the width of the rectangle: ");
				double wt = sc.nextInt();
				
				System.out.println("Enter the length of the rectangle: ");
				double ln = sc.nextInt();
				
				Rectangle rec = new Rectangle(wt, ln);
				result = rec.computeArea();
				
				System.out.println("The area of Rectangle is : " + result);
				
				break;
			case "t":
				
				System.out.println("Enter the height of the triangle: ");
				double ht = sc.nextInt();
				
				System.out.println("Enter the base of the triangle: ");
				double bs = sc.nextInt();
				
				Triangle triangle = new Triangle(ht, bs);
				result = triangle.computeArea();
				
				System.out.println("The area of Triangle is : " + result);
				
				break;
			default:
				System.out.println("Terminated...");
		}
		
		sc.close();
	}

}

/*
	OUTPUT:-
	Enter C for Circle
	Enter R for Rectangle
	Enter T for Triangle
	C
	Enter the radius of the circle: 
	12
	The area of Circle is : 452.3893421169302
	
	Enter C for Circle
	Enter R for Rectangle
	Enter T for Triangle
	R
	Enter the width of the rectangle: 
	12
	Enter the length of the rectangle: 
	13
	The area of Rectangle is : 156.0

	Enter C for Circle
	Enter R for Rectangle
	Enter T for Triangle
	T
	Enter the height of the triangle: 
	12
	Enter the base of the triangle: 
	13
	The area of Triangle is : 78.0

*/
