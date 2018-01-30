public class Triangle{

	public Triangle(int a, int b, int c){
		this.side1=a;
		this.side2=b;
		this.side3=c;
	}

	int side1=3;
	int side2=4;
	int side3=5;
	
	public int getSide1(){
	return this.side1;
	}
	public void setSide1 (int s){
		side1=s;
	}
	public int getSide2(){
	return this.side2;
	}
	public void setSide2 (int s){
		side2=s;
	}

	public int getSide3(){
	return this.side3;
	}
	public void setSide3 (int s){
		side3=s;
	}
	public String toString(){
		return
		    "side1=" + side1 + 
			"side2=" + side2 + 
			"side3=" + side3;
	}

	static public void main(String[] args) {
		Triangle t1 = new Triangle(7,24,25);
		System.out.println("t1=" + t1);
		System.out.println("the area=" + t1.area() );
		System.out.println("the perimeter" + t1.perimeter() );
		System.out.println("angle12=" + t1.angle12() );
		System.out.println("angle13=" + t1.angle13() );
		System.out.println("angle23=" + t1.angle23() );
	}

	// assume  this is a right  triangle
	public int area(){
		return 
		side1 * side2 /2;	
	}
	public int perimeter(){
		return 
		side1 + side2 + side3;	
	}
	// soh cah toa
	/*
		side 2
          -----
          |   /
          |  /
     side1| / side3 h
          |/

	*/
	public double angle12() {
        return 90;
	}
	public double angle13() {
		// sin = opp adj
        // o = side2
        double s1 = this.side1;
        double s2 = this.side2;
        double  h = this.side3;
        double sin = s2 / h;
//        System.out.println(sin);
        double radians = Math.asin(sin);
        return  Math.toDegrees(radians);
        //        double sinRadian = Math.toRadians(sin);
//        System.out.println(sinRadian);
//        return Math.asin(sinRadian);

	}
	public double angle23() {
		// sin = opp adj
        // o = side2
        double s1 = this.side1;
        double s2 = this.side2;
        double  h = this.side3;
        double sin = s1 / h;
        double radians = Math.asin(sin);
        return  Math.toDegrees(radians);
        //        double sinRadian = Math.toRadians(sin);
//        System.out.println(sinRadian);
//        return Math.asin(sinRadian);

	}

	
}