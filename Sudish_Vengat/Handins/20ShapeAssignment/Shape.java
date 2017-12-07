public class Shape {

	protected int sideA = 0;
	protected int sideB = 0;
	protected int sideC = 0;
	protected int sideD = 0;
	protected double perimeter = 0;
	protected double area = 0;
	protected String shapeName = "Shape";

	public Shape(int sideA, int sideB, int sideC, int sideD, double perimeter, double area, String shapeName){
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		this.sideD = sideD;
		this.perimeter = perimeter;
		this.area = area;
		this.shapeName = shapeName;
	}

	protected final int getSideA(){
		return this.sideA;
	}

	protected final void setSideA(int sideA){
		this.sideA = sideA;
	}

	protected final int getSideB(){
		return this.sideB;
	}

	protected final void setSideB(int sideB){
		this.sideB = sideB;
	}

	protected final int getSideC(){
		return this.sideC;
	}

	protected final void setSideC(int sideC){
		this.sideC = sideC;
	}

	protected final int getSideD(){
		return this.sideD;
	}

	protected final void setSideD(int sideD){
		this.sideD = sideD;
	}

	protected final double getArea(){
		return this.area;
	}

	protected final void setArea(double area){
		this.area = area;
	}

	protected final String getShapeName(){
		return this.shapeName;
	}

	protected final void setShapeName(String shapeName){
		this.shapeName = shapeName;
	}

	public Shape(){

	}
}