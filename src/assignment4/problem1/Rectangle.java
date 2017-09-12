package assignment4.problem1;

public class Rectangle extends Shape {

	double width, height;

	Rectangle(Boolean color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	protected double calculateArea() {
		return width*height;
	}
	
	protected double calculatePerimeter() {
		return 2*height + 2*width;
	}

	@Override
	public String toString() {
		return "Rectangle [width: " + width + ", height: " + height + ", color: " + color + ", calculateArea(): "
				+ calculateArea() + ", calculatePerimeter(): " + calculatePerimeter() + "]";
	}

}
