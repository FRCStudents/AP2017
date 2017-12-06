import java.lang.Math.*;

public class Triangle extends Shape {

	// Constructors
	public Triangle(String name, double side1, double side2, double side3) {
		setName(name);
		setSide1(side1);
		setSide2(side2);
		setSide3(side3);
		rememberArea();
		rememberPerimeter();
	}
	public Triangle() {
		this("Triangle", 1, 1, 1);
	}

	// Other Methods
	protected double findArea() {
		double a = side1;
		double b = side2;
		double c = side3;
		double d = (a + b + c) / 2;
		double e = Math.sqrt((d * (d - a) * (d - b) * (d - c)));
		return e;
	}
	protected double findPerimeter() {
		return side1 + side2 + side3;
	}
	public String toString() {
		return "\n" + name + "\nSide 1: " + side1 + "\nSide 2: " + side2 + "\nSide 3: " + 
			side3 + "\nArea: " + area + "\nPerimeter: " + perimeter + "\n";
	}
}