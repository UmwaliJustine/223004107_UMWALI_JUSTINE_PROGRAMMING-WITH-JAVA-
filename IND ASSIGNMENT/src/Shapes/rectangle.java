package Shapes;

public class rectangle {
	
	    private final double length;
	    private final double width;
	    public rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }
	    public double getLength() {
	        return length;
	    }
	    public double getWidth() {
	        return width;
	    }
	    public double calculateArea() {return length * width;}
	    public double calculatePerimeter() {return (length + width);}
	}


