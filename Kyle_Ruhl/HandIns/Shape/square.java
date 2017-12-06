public class square extends Shape{

int sidea;
int sideb;
int sidec;
int sided;
int area;
int perimeter;

public square(int sidea, int sideb, int sidec, int sided){
	sidea = 10;
	sideb = 15;
	sidec = 10;
	sided = 15;
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
