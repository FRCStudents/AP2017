public class ShapeDriver {
	public static void main(String[] argv) {

		Shape[] shapeArray = new Shape[2];
		shapeArray[0] = new Rectangle();
		shapeArray[1] = new Triangle();

		for (int i = 0; i < 2; i++) {
			System.out.print(shapeArray[i]);
		}
	}
}