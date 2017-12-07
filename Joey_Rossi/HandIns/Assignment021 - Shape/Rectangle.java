public class Rectangle extends Shape {
	
	protected final double side3 = 0;

	// Constructors
	public Rectangle(String name, double side1, double side2) {
		setName(name);
		setSide1(side1);
		setSide2(side2);
		rememberArea();
		rememberPerimeter();
	}
	public Rectangle() {
		this("Rectangle", 1, 1);
		rememberArea();
		rememberPerimeter();
	}
}