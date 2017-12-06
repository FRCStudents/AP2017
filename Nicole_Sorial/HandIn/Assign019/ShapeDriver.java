public class ShapeDriver {
	public static void main(String[] argv) {

		Shape[] shapeArray = new Shape[4];
		shapeArray[0] = new Rectangle();
		shapeArray[1] = new Circle();
		shapeArray[2] = new Triangle();
		shapeArray[3] = new Circle("Other Circle", 2);

		for (int i = 0; i < 4; i++) {
			System.out.print(shapeArray[i]);
		}
	}
}