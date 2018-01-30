public class ShapeDriver{
	public static void main(String[] argv) {

		triangle a = new triangle();
		square b = new square();
		rectangle r = new rectangle();
		circle u = new circle();

		a.displaySides();
		a.getPerimeter();
		a.getArea();
		

		b.displaySides();
		b.getPerimeter();
		b.getArea();

		r.displaySides();
		r.getPerimeter();
		r.getArea();

		u.displaySides();
		u.getPerimeter();
		u.getArea();
 }
}
