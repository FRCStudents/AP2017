public class Shape{

protected int height = 0;
protected int width = 0;
protected int sides = 0;
protected int sidea = 0;
protected int sideb = 0;
protected int sidec = 0;
protected int sided = 0;
protected int perimeter = 0;
protected int area = 0;
protected String name = "Shape";

protected void changeName(String newName){
	this.name = newName;
	}

protected final String getName(){
	 return this.name;
	}

public void getPerimeter(){
	System.out.println("Yum " + favFood);
}
	
public void getArea(){
	System.out.println(this.name + " walks around");
}
	
public Shape(){
		
}
	
public Shape(String name, String favFood){		
	this.changeName(name);
	this.favFood = favFood;	
	}


}
