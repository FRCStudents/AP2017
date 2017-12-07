import java.lang.Math.*;
public class circle extends Shape{

double sidea;
double sideb;
double sidec;
double sided;
double area;
double perimeter;

public circle(int sidea, int sideb, int sidec, int sided){
	sidea = 8; //radius
	sideb = 0;
	sidec = 0;
	sided = 0;
}

public void displaySides(){
	System.out.println("Radius: " + sidea /*+ "," + sideb + "," + sidec + "," + sided*/);
}

public void getPerimeter(double pi, double circumference, double radius){
	pi = 3.14;
	radius = sidea;
	circumference = (2*pi*radius);
	perimeter = circumference; 
	System.out.println("Circumference = " + perimeter);
}

public void getArea(double pi, double radius){
	pi = 3.14;
	radius = sidea;
	area = (pi*radius*radius);
	System.out.println(area);
}

}

