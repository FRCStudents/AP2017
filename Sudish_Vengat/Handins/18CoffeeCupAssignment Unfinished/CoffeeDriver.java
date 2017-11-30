public class CoffeeDriver{

	public static void main(String[] argv){

		Coffee c = new Coffer();
		
		for(int b = 0; b < 50; b++){
			System.out.println();
		}

		System.out.println("");
		b.setSquare(0, 0, "");
		b.setSquare(0, 1, "");
		b.setSquare(0, 2, "");
		b.setSquare(0, 3, "O");
		b.setSquare(1, 0, "");
		b.setSquare(1, 1, "");
		b.setSquare(1, 2, "O");
		b.setSquare(1, 3, "");
		b.setSquare(2, 0, "");
		b.setSquare(2, 1, "O");
		b.setSquare(2, 2, "");
		b.setSquare(2, 3, "");
		b.setSquare(3, 0, "");
		b.setSquare(3, 2, "");
		b.setSquare(3, 2, "");
		b.setSquare(3, 3, "");
		
		

		b.displayBoard();
	}
}