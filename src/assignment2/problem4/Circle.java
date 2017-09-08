package assignment2.problem4;

public class Circle {
	
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public Double computeArea() {
		// TODO Auto-generated method stub
		return Math.PI*this.radius*this.radius;
	}

}
