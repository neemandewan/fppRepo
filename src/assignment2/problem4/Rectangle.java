package assignment2.problem4;

final public class Rectangle {
	private double width, length;
	
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}


	public double getLength() {
		return length;
	}


	public double computeArea() {
		return this.width*this.length;
	}
}
