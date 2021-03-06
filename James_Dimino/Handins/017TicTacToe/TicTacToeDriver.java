import java.util.Scanner;

public class TicTacToeDriver{
	public static void main(String[] args){

		int repeatGame = 0;
		int determine = 0;

		TicTacToe t = new TicTacToe();

		while (repeatGame == 0){
			
			t.playGame();
			t.scorePrinter();

			while (determine == 0){
			
			Scanner scanner009 = new Scanner(System.in);
			System.out.println("\nWould You Like To Play Again?\n\n1 -> Play Again\n2 -> End Program");
			int determineRepeat = scanner009.nextInt();

				if (determineRepeat == 1){
					System.out.println("Restarting Game...");
					determine++;
				}

				if (determineRepeat == 2){
					t.spaceMaker();
					System.out.println("\nFinal Score:");
					t.scorePrinter();
					System.out.println("Ending Program...");
					repeatGame++;
					determine++;
				}
			}

			determine--;

			t.resetGame();
		}
	}
}