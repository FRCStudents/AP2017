public class Square extends Shape {

	protected String shapeName = "Square";
	protected double sideA;
	protected double sideB;
	protected double sideC;
	protected double sideD;
	protected double area;
	protected double perimeter;

	public Square(int sideA, int sideB, int sideC, int sideD){
		sideA = 4;
		sideB = 4;
		sideC = 4;
		sideD = 4;
	}

	public void showShape(){
		System.out.println("Square: " + sideA + sideB + sideC + sideD);
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