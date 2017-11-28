public class TicTacToeDriver{
	public static void main (String [] argv){
		TicTacToe a = new TicTacToe();

		a.setSquare(0, 0, "x");
		a.setSquare(0, 1, " ");
		a.setSquare(0, 2, "x");
		a.setSquare(1, 0, " ");
		a.setSquare(1, 1, " ");
		a.setSquare(1, 2, " ");
		a.setSquare(2, 0, "x");
		a.setSquare(2, 1, " ");
		a.setSquare(2, 2, "x");

		a.showBoard();

		System.out.println(" ");

		a.setSquare(0, 0, " ");
		a.setSquare(0, 1, "t");
		a.setSquare(0, 2, " ");
		a.setSquare(1, 0, "t");
		a.setSquare(1, 1, "t");
		a.setSquare(1, 2, "t");
		a.setSquare(2, 0, " ");
		a.setSquare(2, 1, "t");
		a.setSquare(2, 2, " ");

		a.showBoard();

	}
}