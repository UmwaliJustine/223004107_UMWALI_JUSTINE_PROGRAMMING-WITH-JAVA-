package Shapes;

public class circle {
	private double radius;

	public circle(double radius) {
		this.radius = radius;
	}
	public double calculateArea() {
		return Math.PI * this.radius * this.radius;
	}
	public double calculatePerimeter() {
		return Math.PI * this.radius * 2;
	}



}