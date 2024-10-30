package studio7;

public class Complex {
	
	private double a;
	private double b;
	
	public Complex(double real, double imaginary) {
		a = real;
		b = imaginary;
	}
	public String show() {
		return (""+a+" + "+b+"i");
	}
	public Complex add(Complex i2) {
		return new Complex(a+i2.a,b+i2.b);
	}
	public Complex multiply(Complex other) {
		return new Complex(a * other.a - b * other.b, a * other.b + b * other.a);
	}

}
