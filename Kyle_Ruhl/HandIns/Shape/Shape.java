public class Shape{

protected int sidea = 0;
protected int sideb = 0;
protected int sidec = 0;
protected int sided = 0;
protected double perimeter = 0;
protected double area = 0;
protected String name = "Shape";

protected void changeName(String newName){
	this.name = newName;
	}

protected final String getName(){
	 return this.name;
	}

public void getPerimeter(){
	System.out.println(perimeter);
}
	
public void getArea(){
	System.out.println(area);
}
	
public Shape(){
		
}
	
}
