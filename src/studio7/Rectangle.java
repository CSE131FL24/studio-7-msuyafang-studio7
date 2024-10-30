package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {

	private double length;
	private double width;

	public Rectangle (double theLength,double theWidth) {
		length = theLength;
		width = theWidth;
	}

	public double area() {
		return length * width;
	}

	public double perimeter() {
		return 2 * (length + width);
	}

	public boolean isSquare() {
		if (length == width) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isSmaller(Rectangle r2) {
		if (area() < r2.area()) {
			return true;
		} else {
			return false;
		}
	}
}