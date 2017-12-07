import java.lang.Math.*;
public class triangle extends Shape{

double sidea;
double sideb;
double sidec;
double sided;
double area;
double perimeter;

public triangle(int sidea, int sideb, int sidec, int sided){
	sidea = 15;
	sideb = 20;
	sidec = 30;
	sided = 0;
}

public void displaySides(){
	System.out.println("Side Lengths: " + sidea + "," + sideb + "," + sidec + "," + sided);
}

public void getPerimeter(){
	perimeter = (sidea + sideb + sidec + sided);
	System.out.println(perimeter);
}

public void getArea(double p, double r){
	p = (perimeter/2);
	r = ((p-sidea)*(p-sideb)*(p-sidec));
	area = Math.sqrt(r);
	System.out.println(area);
}

}
