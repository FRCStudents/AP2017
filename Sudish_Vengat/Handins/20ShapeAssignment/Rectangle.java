public class Rectangle extends Shape {

	protected String shapeName = "Rectangle";
	protected double sideA;
	protected double sideB;
	protected double sideC;
	protected double sideD;
	protected double area;
	protected double perimeter;

	public Rectangle(int sideA, int sideB, int sideC, int sideD){
		sideA = 4;
		sideB = 8;
		sideC = 4;
		sideD = 8;
	}

	public void showShape(){
		System.out.println("Rectangle" + sideA + sideB + sideC + sideD);
	}

	public void findArea(){
		area = (sideA * sideB);
		System.out.println(area);
	}

	public void findPerimeter(){
		perimeter = (sideA + sideB + sideC + sideD);
		System.out.println(perimeter);
	}
}