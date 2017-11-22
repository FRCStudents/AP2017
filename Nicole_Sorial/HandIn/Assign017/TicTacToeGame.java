import java.util.*;

class TicTacToeGame {
	public static void main(String[] argv) {

		Scanner s = new Scanner(System.in);
		TicTacToe t = new TicTacToe();
		System.out.println("Welcome to TicTacToe! Player 1 will be X, Player 2 will be +");
		System.out.println("Here is what the board looks like:");
		System.out.println("  1 2 3\nA _ _ _\nB _ _ _\nC _ _ _");
		System.out.println("To mark a spot, enter the letter of that row and the number of that column, then push ENTER.");
		System.out.println("Player 1 goes first.");

		for (int i = t.keepPlaying; i < 1; i = t.keepPlaying) {
			System.out.println("Player 1: please input your spot");
			t.acceptSpot();
			t.setSquareX(t.getX(), t.getY());
			if (t.keepPlaying == 0) {
				System.out.println("Player 2: please input your spot");
				t.acceptSpot();
				t.setSquareO(t.getX(), t.getY());
			}
		}

		System.out.println("Thanks for playing!");
	}
}