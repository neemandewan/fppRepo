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
		for(Shape s: shapes) {
			System.out.println("Area is: " + s.calculateArea());
			System.out.println("Perimeter is: " + s.calculatePerimeter() + "\n");
		}
	}
}
