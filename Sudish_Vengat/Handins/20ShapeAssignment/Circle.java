import java.lang.Math.*;

public class Circle extends Shape {

	protected double sideA;
	protected double sideB;
	protected double sideC;
	protected double sideD;
	protected double area;
	protected double perimeter;

	public Circle(int sideA, int sideB, int sideC, int sideD){
		sideA = 3;
		sideB = 0;
		sideC = 0;
		sideD = 0;
	}

	public void showShape(){
		System.out.println("Circle: " + sideA + sideB + sideC + sideD);
	}

	public void findPerimeter(double pi, double circumference, double radius){
		pi = 3.14;
		radius = sideA;
		circumference = (2*pi*radius);
		perimeter = circumference; 
		System.out.println(perimeter);
	}

	public void findArea(double pi, double radius){
		pi = 3.14;
		radius = sideA;
		area = (pi*radius*radius);
		System.out.println(area);
	}
}