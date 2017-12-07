public class ShapeDriver {

	public static void main(String[] args){

		Circle c = new Circle(3,0,0,0);
		Triangle t = new Triangle(2,2,6,0);
		Square s = new Square(4,4,4,4);
		Rectangle r = new Rectangle(4,8,4,8);

		c.showShape();
		//c.findPerimeter();
		//c.findArea();

		t.showShape();
		t.findPerimeter();
		//t.findArea();

		s.showShape();
		s.findPerimeter();
		s.findArea();

		r.showShape();
		r.findPerimeter();
		r.findArea();
	}
}