package assignment2.problem4;

final public class Triangle {
	private double height, base;
	
	public Triangle(double height, double base) {
		super();
		this.height = height;
		this.base = base;
	}

	public double getWidth() {
		return height;
	}


	public double getBase() {
		return base;
	}

	public double computeArea() {
		return 0.5*this.base*this.height;
	}
}
