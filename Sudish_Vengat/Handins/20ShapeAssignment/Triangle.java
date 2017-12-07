import java.lang.Math.*;

public class Triangle extends Shape {

	protected double sideA;
	protected double sideB;
	protected double sideC;
	protected double sideD;
	protected double area;
	protected double perimeter;

	public Triangle(int sideA, int sideB, int sideC, int sideD){
		sideA = 2;
		sideB = 2;
		sideC = 6;
		sideD = 0;
	}

	public void showShape(){
		System.out.println("Triangle: " + sideA + sideB + sideC + sideA);
	}

	public void findPerimeter(){
		perimeter = (sideA + sideB + sideC + sideD);
		System.out.println(perimeter);
	}

	public void findArea(double b, double z){
		b = (perimeter/2);
		z = ((b-sideA)*(b-sideB)*(b-sideC));
		area = Math.sqrt(z);
		System.out.println(area);
	}
}