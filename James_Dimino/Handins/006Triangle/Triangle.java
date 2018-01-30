class Triangle{

	int side1 = 5;
	int side2 = 5;
	int side3 = 5;
	int perimeter = side1 + side2 + side3;


	public int getside1(){
		return side1;
	}

	public void setside1(int x){
		side1 = x;
	}

	public int getside2(){
		return side2;
	}

	public void setside2(int y){
		side2 = y;
	}

	public int getside3(){
		return side3;
	}

	public void setside3(int z){
		side3 = z;
	}

	public int getperimeter(){
		return perimeter;
	}

	public void setperimeter(int New_Perimeter){
	perimeter = New_Perimeter;
	}
	

	public int area(){
		int area = (perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3))^1/2;
	return area;
	}

	public String toString(){
		return "It's a Triangle!";
	}
	
}
