public class square extends Shape{

String name = "Square";
double sidea;
double sideb;
double sidec;
double sided;
double area;
double perimeter;

public square(int sidea, int sideb, int sidec, int sided){
	sidea = 10;
	sideb = 10;
	sidec = 10;
	sided = 10;
}

public void displaySides(){
	System.out.println("Side Lengths: " + sidea + "," + sideb + "," + sidec + "," + sided);
}

public void getArea(){
	area = (sidea * sideb);
	System.out.println(area);
}

public void getPerimeter(){
	perimeter = (sidea + sideb + sidec + sided);
	System.out.println(perimeter);
}

}
