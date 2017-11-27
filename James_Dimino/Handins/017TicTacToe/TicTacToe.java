//James Dimino

import java.util.Scanner;

public class TicTacToe{
	
	private String[][] demoBoard = {{"1","2","3"},
									{"4","5","6"},
									{"7","8","9"}};

	private String[][] gameBoard = {{"-","-","-"},
									{"-","-","-"},
									{"-","-","-"}};

	private int drawCheckCounter = 0;
	private int winner = 0;
	private int p1Choice = 0;
	private int p2Choice = 0;
	private int p1Score = 0;
	private int p2Score = 0;


//Prints Out Game Board
		public void showGameBoard(){
			System.out.println("Game Board: ");
			for (int row = 0; row < gameBoard.length; row++){
				for (int col = 0; col < gameBoard.length; col++){
					System.out.print(gameBoard[row][col] + " ");
				}
			System.out.println();
			}
		}

//Prints Out Demo Board
		public void showDemoBoard(){
			System.out.println("Demo Board: ");
			for (int row = 0; row < demoBoard.length; row++){
				for (int col = 0; col < demoBoard.length; col++){
					System.out.print(demoBoard[row][col] + " ");
				}
			System.out.println();
			}
		}

//Returns A Specific Location On Game Board
		public String getSquare(int row, int col){
			return gameBoard[row][col];
		}

//Sets A Specific Location On Game Board To X
		public void setX(int row, int col){
			gameBoard[row][col] = "X";
		}

//Sets A Specific Location On Game Board To O
		public void setO(int row, int col){
			gameBoard[row][col] = "O";
		}

//Sets A Specific Location On Game Board To Either X Or O (User Gets To Choose)
		public void setSquare(String piece, int row, int col){
			gameBoard[row][col] = piece;
		}

//Plays The Game
		public void playGame(){
			while (winner == 0){
				while (p1Choice == 0){
				if (!(checkWinnerO())){

				spaceMaker();

				if (drawCheckCounter == -1){
						drawCheckCounter++;
						System.out.println("It's A Tie\n");
					}

				scorePrinter();
				showDemoBoard();
				showGameBoard();

				Scanner scanner001 = new Scanner(System.in);
				System.out.println("Player 1 (X): Where Would You Like To Place Your Piece?");
				String playerOne = scanner001.nextLine();

				spaceMaker();

				if (playerOne.equals("1")){
					if (gameBoard[0][0] != "X" && gameBoard[0][0] != "O"){
						setX(0,0);
						demoBoard[0][0] = "-";
						p1Choice++;
					}
				} 

				else if (playerOne.equals("2")){
					if (gameBoard[0][1] != "X" && gameBoard[0][1] != "O"){
						setX(0,1);
						demoBoard[0][1] = "-";
						p1Choice++;
					}
				}

				else if (playerOne.equals("3")){
					if (gameBoard[0][2] != "X" && gameBoard[0][2] != "O"){
						setX(0,2);
						demoBoard[0][2] = "-";
						p1Choice++;
					}
				}

				else if (playerOne.equals("4")){
					if (gameBoard[1][0] != "X" && gameBoard[1][0] != "O"){
						setX(1,0);
						demoBoard[1][0] = "-";
						p1Choice++;
					}
				}

				else if (playerOne.equals("5")){
					if (gameBoard[1][1] != "X" && gameBoard[1][1] != "O"){
						setX(1,1);
						demoBoard[1][1] = "-";
						p1Choice++;
					}
				}

				else if (playerOne.equals("6")){
					if (gameBoard[1][2] != "X" && gameBoard[1][2] != "O"){
						setX(1,2);
						demoBoard[1][2] = "-";
						p1Choice++;
					}
				}

				else if (playerOne.equals("7")){
					if (gameBoard[2][0] != "X" && gameBoard[2][0] != "O"){
						setX(2,0);
						demoBoard[2][0] = "-";
						p1Choice++;
					}
				}

				else if (playerOne.equals("8")){
					if (gameBoard[2][1] != "X" && gameBoard[2][1] != "O"){
						setX(2,1);
						demoBoard[2][1] = "-";
						p1Choice++;
					}
				}

				else if (playerOne.equals("9")){
					if (gameBoard[2][2] != "X" && gameBoard[2][2] != "O"){
						setX(2,2);
						demoBoard[2][2] = "-";
						p1Choice++;
					}
				}

				else {
					System.out.println("That Is Not A Valid Option");
					continue;
				}
				}
			}

			p1Choice--;

					if (checkWinnerX()){
						showGameBoard();
						System.out.println("\nPlayer 1 (X) Wins!");
						p1Score++;
						break;
					}

				drawCheckCounter++;

			if (drawCheckCounter == 9){
				resetGame();
				drawCheckCounter--;
				continue;
				}

				while (p2Choice == 0){
				if (!(checkWinnerX())){

				spaceMaker();

				scorePrinter();
				showDemoBoard();
				showGameBoard();

				Scanner scanner002 = new Scanner(System.in);
				System.out.println("Player 2 (O): Where Would You Like To Place Your Piece?");
				String playerTwo = scanner002.nextLine();

				spaceMaker();

				if (playerTwo.equals("1")){
					if (gameBoard[0][0] != "X" && gameBoard[0][0] != "O"){
						setO(0,0);
						demoBoard[0][0] = "-";
						p2Choice++;
					}
				} 

				else if (playerTwo.equals("2")){
					if (gameBoard[0][1] != "X" && gameBoard[0][1] != "O"){
						setO(0,1);
						demoBoard[0][1] = "-";
						p2Choice++;
					}
				}

				else if (playerTwo.equals("3")){
					if (gameBoard[0][2] != "X" && gameBoard[0][2] != "O"){
						setO(0,2);
						demoBoard[0][2] = "-";
						p2Choice++;
					}
				}

				else if (playerTwo.equals("4")){
					if (gameBoard[1][0] != "X" && gameBoard[1][0] != "O"){
						setO(1,0);
						demoBoard[1][0] = "-";
						p2Choice++;
					}
				}

				else if (playerTwo.equals("5")){
					if (gameBoard[1][1] != "X" && gameBoard[1][1] != "O"){
						setO(1,1);
						demoBoard[1][1] = "-";
						p2Choice++;
					}
				}

				else if (playerTwo.equals("6")){
					if (gameBoard[1][2] != "X" && gameBoard[1][2] != "O"){
						setO(1,2);
						demoBoard[1][2] = "-";
						p2Choice++;
					}
				}

				else if (playerTwo.equals("7")){
					if (gameBoard[2][0] != "X" && gameBoard[2][0] != "O"){
						setO(2,0);
						demoBoard[2][0] = "-";
						p2Choice++;
					}
				}

				else if (playerTwo.equals("8")){
					if (gameBoard[2][1] != "X" && gameBoard[2][1] != "O"){
						setO(2,1);
						demoBoard[2][1] = "-";
						p2Choice++;
					}
				}

				else if (playerTwo.equals("9")){
					if (gameBoard[2][2] != "X" && gameBoard[2][2] != "O"){
						setO(2,2);
						demoBoard[2][2] = "-";
						p2Choice++;
					}
				} 

				else {
					System.out.println("That Is Not A Valid Option");
				}

				}
			}

				p2Choice--;
			
					if (checkWinnerO()){
						showGameBoard();
						System.out.println("\nPlayer 2 (O) Wins!");
						p2Score++;
						break;
					}

				drawCheckCounter++;

			}
		}

//Checks If Player 1 (X) Is The Winner
		public boolean checkWinnerX(){
			if (gameBoard[0][0].equals("X") && gameBoard[1][0].equals("X") && gameBoard[2][0].equals("X")){	
				return true;
			}
			if (gameBoard[0][1].equals("X") && gameBoard[1][1].equals("X") && gameBoard[2][1].equals("X")){	
				return true;
			}
			if (gameBoard[0][2].equals("X") && gameBoard[1][2].equals("X") && gameBoard[2][2].equals("X")){	
				return true;
			}
			if (gameBoard[0][0].equals("X") && gameBoard[0][1].equals("X") && gameBoard[0][2].equals("X")){	
				return true;
			}
			if (gameBoard[1][0].equals("X") && gameBoard[1][1].equals("X") && gameBoard[1][2].equals("X")){	
				return true;
			}
			if (gameBoard[2][0].equals("X") && gameBoard[2][1].equals("X") && gameBoard[2][2].equals("X")){	
				return true;
			}
			if (gameBoard[0][0].equals("X") && gameBoard[1][1].equals("X") && gameBoard[2][2].equals("X")){	
				return true;
			}
			if (gameBoard[2][0].equals("X") && gameBoard[1][1].equals("X") && gameBoard[0][2].equals("X")){	
				return true;
			} else {
				return false;
			}
		}

//Checks If Player 2 (O) Is The Winner
		public boolean checkWinnerO(){
			if (gameBoard[0][0].equals("O") && gameBoard[1][0].equals("O") && gameBoard[2][0].equals("O")){	
				return true;
			}
			if (gameBoard[0][1].equals("O") && gameBoard[1][1].equals("O") && gameBoard[2][1].equals("O")){	
				return true;
			}
			if (gameBoard[0][2].equals("O") && gameBoard[1][2].equals("O") && gameBoard[2][2].equals("O")){	
				return true;
			}
			if (gameBoard[0][0].equals("O") && gameBoard[0][1].equals("O") && gameBoard[0][2].equals("O")){	
				return true;
			}
			if (gameBoard[1][0].equals("O") && gameBoard[1][1].equals("O") && gameBoard[1][2].equals("O")){	
				return true;
			}
			if (gameBoard[2][0].equals("O") && gameBoard[2][1].equals("O") && gameBoard[2][2].equals("O")){	
				return true;
			}
			if (gameBoard[0][0].equals("O") && gameBoard[1][1].equals("O") && gameBoard[2][2].equals("O")){	
				return true;
			}
			if (gameBoard[2][0].equals("O") && gameBoard[1][1].equals("O") && gameBoard[0][2].equals("O")){	
				return true;
			} else {
				return false;
			}

		}

//Resets The Game To Its Original Values
		public void resetGame(){
			demoBoard[0][0] = "1";
			demoBoard[0][1] = "2";
			demoBoard[0][2] = "3";
			demoBoard[1][0] = "4";
			demoBoard[1][1] = "5";
			demoBoard[1][2] = "6";
			demoBoard[2][0] = "7";
			demoBoard[2][1] = "8";
			demoBoard[2][2] = "9";


			gameBoard[0][0] = "-";
			gameBoard[1][0] = "-";
			gameBoard[2][0] = "-";
			gameBoard[0][1] = "-";
			gameBoard[1][1] = "-";
			gameBoard[2][1] = "-";
			gameBoard[0][2] = "-";
			gameBoard[1][2] = "-";
			gameBoard[2][2] = "-";

			drawCheckCounter = 0;

		}

//Prints Out The Player And How Many Wins They Have
		public void scorePrinter(){
			System.out.println("\nPlayer 1: " + p1Score + " Wins" + "\nPlayer 2: " + p2Score + " Wins\n");
		}

//Creates 80 Blank Lines
		public void spaceMaker(){
			for(int b = 0; b <= 80; b++){
            	System.out.print("\n");
        	}
		}

}