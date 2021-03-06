public class ShapeDriver{
	public static void main (String [] argv){
		Shape [] shapes = new Shape [1];
		Triangle a = new Triangle();

		shapes[0] = a;

		a.setTriSide(1,6);
		a.setTriSide(2,6);
		a.setTriSide(3,6);

		shapes[0].setNumSides(3);
		shapes[0].setHeight(6);
		shapes[0].setWidth(6);

		a.getTriPerimeter();
		a.triArea();

		for(int i = 0; i < shapes.length; i++){
			System.out.println(a.getName() + "\n Number of Sides:" + shapes[i].getNumSides() + "\n Perimeter: "+ a.getTriPerimeter() + "\n Area: " + a.triArea());
		}
	}
}