package Shapes;

public class square {
	private double side;

	public square(double side) {
		this.side = side;
	}
	public double calculateArea() {
		return this.side * this.side;
	}
	public double calculatePerimeter() {
		return this.side * 4;
	}


}