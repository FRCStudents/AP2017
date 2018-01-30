public class TicTacToeDriver{

	public static void main (String [] argv){

		TicTacToe b = new TicTacToe();
		
		int s;
		for(s = 0; s < 50; s++){
		}

		System.out.println("Board #1: ");
		b.setSpace(0, 0, "X");
		b.setSpace(0, 1, " ");
		b.setSpace(0, 2, "X");
		b.setSpace(1, 0, " ");
		b.setSpace(1, 1, " ");
		b.setSpace(1, 2, " ");
		b.setSpace(2, 0, "X");
		b.setSpace(2, 1, " ");
		b.setSpace(2, 2, "X");

		b.displayBoardOne();

		System.out.println("\n\nBoard #2: ");
		b.setSpace(0, 0, " ");
		b.setSpace(0, 1, "X");
		b.setSpace(0, 2, " ");
		b.setSpace(1, 0, "X");
		b.setSpace(1, 1, "X");
		b.setSpace(1, 2, "X");
		b.setSpace(2, 0, " ");
		b.setSpace(2, 1, "X");
		b.setSpace(2, 2, " ");

		b.displayBoardTwo();
	}
}