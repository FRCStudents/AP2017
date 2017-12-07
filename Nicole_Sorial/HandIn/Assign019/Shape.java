public class Shape {

	// Attributes
	protected String name;
	protected double side1;
	protected double side2;
	protected double side3;
	protected double area;
	protected double perimeter;

	// Constructors
	public Shape(String name, double side1, double side2, double side3) {
		setName(name);
		setSide1(side1);
		setSide2(side2);
		setSide3(side3);
	}
	public Shape() {
		this("Shape", 1, 1, 1);
	}

	// Getters and Setters
	protected final String getName() {
		return name;
	}
	protected final void setName(String newname) {
		name = newname;
	}
	protected final double getSide1() {
		return side1;
	}
	protected final void setSide1(double x) {
		side1 = x;
	}
	protected final double getSide2() {
		return side2;
	}
	protected final void setSide2(double x) {
		side2 = x;
	}
	protected final double getSide3() {
		return side3;
	}
	protected final void setSide3(double x) {
		side3 = x;
	}

	// Other Methods
	protected double findArea() {
		return side1 * side2; // works for rectangles and squares
	}
	protected void rememberArea() {
		area = findArea();
	}
	protected double findPerimeter() {
		return (2 * side1) + (2 * side2); // works for rectangles and squares
	}
	protected void rememberPerimeter() {
		perimeter = findPerimeter();
	}
	public String toString() {
		return "\n" + name + "\nSide 1: " + side1 + "\nSide 2: " + side2 + 
			"\nArea: " + area + "\nPerimeter: " + perimeter + "\n";
	}
}