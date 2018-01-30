public class TicTacToeDriver{
	public static void main (String [] argv){
		TicTacToe r = new TicTacToe();
		


		int y;
		for(y = 0; y < 50; y++){
			System.out.println();
		}

		System.out.println("Board Situation #1: ");
		r.setSquare(0, 0, "X");
		r.setSquare(0, 1, " ");
		r.setSquare(0, 2, "X");
		r.setSquare(1, 0, " ");
		r.setSquare(1, 1, " ");
		r.setSquare(1, 2, " ");
		r.setSquare(2, 0, "X");
		r.setSquare(2, 1, " ");
		r.setSquare(2, 2, "X");

		r.displayBoard();

		System.out.println("\n\nBoard Situation #2: ");
		r.setSquare(0, 0, " ");
		r.setSquare(0, 1, "O");
		r.setSquare(0, 2, " ");
		r.setSquare(1, 0, "O");
		r.setSquare(1, 1, "O");
		r.setSquare(1, 2, "O");
		r.setSquare(2, 0, " ");
		r.setSquare(2, 1, "O");
		r.setSquare(2, 2, " ");

		r.displayBoard();
		System.out.println();

	}
}
