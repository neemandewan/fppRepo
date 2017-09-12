package assignment4.problem1;

public class Circle extends Shape {
	double radius;

	Circle(Boolean color, double radius) {
		super(color);
		this.radius = radius;
	}
	
	protected double calculateArea() {
		return Math.PI*radius*radius;
	}
	
	protected double calculatePerimeter() {
		return 2*Math.PI*radius;
	}

	@Override
	public String toString() {
		return "Circle [radius: " + radius + ", calculateArea(): " + calculateArea() + ", calculatePerimeter(): "
				+ calculatePerimeter() + "]";
	}
	
	
}
