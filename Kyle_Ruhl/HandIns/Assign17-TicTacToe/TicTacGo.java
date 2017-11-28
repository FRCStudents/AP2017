//driver for TicTac
public class TicTacGo{
	public static void main (String [] argv){
		TicTac r = new TicTac();
		
		//White outs the screen. Prints 50 blank Lines:::
		int y;
		for(y = 0; y < 50; y++){
			System.out.println();
		}

		/*-------------------------------------------------------
		*sets the values for board situation # 1. Board's pattern should look like:
		
		|X| |X|
		| |X| |
		|X| |X|	
		
		*/
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
		
		/* --------------------------------------------------------
		*sets the values for board situation #2. Board's pattern should look like:
		
		| |X| |
		|X|X|X|
		| |X| |	
		
		*/
		System.out.println("\n\nBoard Situation #2: ");
		r.setSquare(0, 0, " ");
		r.setSquare(0, 1, "X");
		r.setSquare(0, 2, " ");
		r.setSquare(1, 0, "X");
		r.setSquare(1, 1, "X");
		r.setSquare(1, 2, "X");
		r.setSquare(2, 0, " ");
		r.setSquare(2, 1, "X");
		r.setSquare(2, 2, " ");

		r.displayBoard();
		System.out.println();

	}
}
