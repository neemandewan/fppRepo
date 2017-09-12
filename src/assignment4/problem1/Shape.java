package assignment4.problem1;

public class Shape {
	
	Boolean color;
	
	Shape(Boolean color) {
		this.color = color;
	}

	protected double calculateArea() {
		return 0.0;
	}
	
	protected double calculatePerimeter() {
		return 0.0;
	}

	@Override
	public String toString() {
		return "Shape [color: " + color + ", calculateArea(): " + calculateArea() + ", calculatePerimeter(): "
				+ calculatePerimeter() + "]";
	}
	
}
