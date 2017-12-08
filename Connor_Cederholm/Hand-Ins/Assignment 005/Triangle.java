class Triangle extends Shape{

	String name = "Triangle";
	int [] sides = new int[3];
	int perimeter;

	public void setTriSide(int spot, int val){
		sides[spot -1] = val;
	}

	public String getName(){
		return name;
	}

	public void displayShape(){
		System.out.println(getName());
	}

	public int getTriPerimeter(){
		
		for(int i = 0; i < getNumSides(); i ++){
			perimeter = perimeter + sides[i];
		}
		return perimeter;
	}
	

	public double triArea(){
		double area = (0.5* getWidth())*(getHeight());
	return area;
	}

	public String toString(){
		return "TriangleBaby";
	}


}