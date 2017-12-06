import java.lang.Math.*;

public class Circle extends Shape {

	// Attributes
	protected double radius;
	protected double circumf;
	protected final double side1 = 0;
	protected final double side2 = 0;
	protected final double side3 = 0;

	// Constructors
	public Circle(String name, double radius) {
		setName(name);
		setRadius(radius);
		setCircumf(radius);
		rememberArea();
		rememberPerimeter();
	}
	public Circle() {
		this("Circle", 1);
		rememberArea();
		rememberPerimeter();
	}

	// Getters and Setters
	protected double getRadius() {
		return radius;
	}
	protected void setRadius(double x) {
		radius = x;
	}
	protected double getCircumf() {
		return circumf;
	}
	protected void setCircumf(double radius) {
		circumf = 2 * Math.PI * radius;
	}

	// Other Methods
	protected double findArea() {
		return Math.PI * Math.pow(radius, 2);
	}	
	protected double findPerimeter() {
		return circumf;
	}
	public String toString() {
		return "\n" + name + "\nRadius: " + radius + "\nCircumference: " + circumf + "\nArea: " + area  + "\n";
	}


}