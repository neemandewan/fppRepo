package assignment4.problem1;

public class Rectangle extends Shape {

	double width, height;

	Rectangle(Boolean color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	protected double calculateArea() {
		return this.width*this.height;
	}
	
	protected double calculatePerimeter() {
		return 2*this.height + 2*this.width;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", color=" + color + ", calculateArea()="
				+ calculateArea() + ", calculatePerimeter()=" + calculatePerimeter() + "]";
	}

}
