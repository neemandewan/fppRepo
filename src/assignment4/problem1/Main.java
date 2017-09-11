package assignment4.problem1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape[] shapes = new Shape[5];
		
		shapes[0] = new Rectangle(true, 12, 15);
		shapes[1] = new Circle(false, 11);
		shapes[2] = new Square(true, 13);
		shapes[3] = new Rectangle(true, 25.32, 45.11);
		shapes[4] = new Square(false, 19.85);
		
		printTotal(shapes);

	}
	
	public static void printTotal(Shape[] shapes) {
		int sumArea = 0;
		int sumPerimeter = 0;
		for(Shape s: shapes) {
			sumArea += s.calculateArea();
			sumPerimeter += s.calculatePerimeter();
		}
		
		System.out.println("sum of area is: " + sumArea);
		System.out.println("sum of perimeter is: " + sumPerimeter);
	}
}
