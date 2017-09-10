package assignment4.problem1;

public class Square extends Rectangle {

	public Square(Boolean color, double side) {
		super(color, side, side);
	}

	@Override
	public String toString() {
		return "Square [calculateArea()=" + calculateArea() + ", calculatePerimeter()=" + calculatePerimeter() + "]";
	}
	
	
}
