public class triangle extends Shape{

int sidea;
int sideb;
int sidec;
int sided;
int area;
int perimeter;

public square(int sidea, int sideb, int sidec, int sided){
	sidea = 15;
	sideb = 20;
	sidec = 30;
	sided = 0;
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
