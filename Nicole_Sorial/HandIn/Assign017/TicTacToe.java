import java.util.*;
class TicTacToe {

	private String[][] board =  new String[3][3];
	public int keepPlaying = 0;
	private String spot;
	private int x;
	private int y;
	Scanner s = new Scanner(System.in);

	TicTacToe() {
		board =  new String[3][3];
		emptyBoard();
	}

	public void emptyBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = "_ ";
			}
		}
	}

	public String getSquare(int a, int b) {
		return board[a][b];
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setSquareX(int a, int b) {
		board[a][b] = "X ";
		printBoard();
		determineXWinner();
	}

	public void setSquareO(int a, int b) {
		board[a][b] = "+ ";
		printBoard();
		determineOWinner();
	}

	public void setCorners() {
		int a = 0;
		int b = 2;
		setSquareX(a, a);
		setSquareX(a, b);
		setSquareX(b, b);
		setSquareX(b, a);
	}

	public void setCross() {
		int a = 0;
		int b = 1;
		int c = 2;
		setSquareO(a, b);
		setSquareO(b, a);
		setSquareO(b, b);
		setSquareO(b, c);
		setSquareO(c, b);
	}

	public void printBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println("");
		}
	}

	public void acceptSpot() {
		spot = s.nextLine();
		spot = spot.toLowerCase();
		if (spot.equals("a1")) {
			x = 0;
			y = 0;
		} else
		if (spot.equals("a2")) {
			x = 0;
			y = 1;
		} else
		if (spot.equals("a3")) {
			x = 0;
			y = 2;
		} else
		if (spot.equals("b1")) {
			x = 1;
			y = 0;
		} else
		if (spot.equals("b2")) {
			x = 1;
			y = 1;
		} else
		if (spot.equals("b3")) {
			x = 1;
			y = 2;
		} else
		if (spot.equals("c1")) {
			x = 2;
			y = 0;
		} else
		if (spot.equals("c2")) {
			x = 2;
			y = 1;
		} else
		if (spot.equals("c3")) {
			x = 2;
			y = 2;
		} else {
			System.out.println("Please input a valid spot");
			acceptSpot();
		}
	}


	public void determineXWinner() {
		if (board[0][0].equals("X ") && board[0][1].equals("X ") && board[0][2].equals("X ")) {
			System.out.println("Player 1 wins!");
			keepPlaying++;
		}
		if (board[1][0].equals("X ") && board[1][1].equals("X ") && board[1][2].equals("X ")) {
			System.out.println("Player 1 wins!");
			keepPlaying++;
		}
		if (board[2][0].equals("X ") && board[2][1].equals("X ") && board[2][2].equals("X ")) {
			System.out.println("Player 1 wins!");
			keepPlaying++;
		}
		if (board[0][0].equals("X ") && board[1][0].equals("X ") && board[2][0].equals("X ")) {
			System.out.println("Player 1 wins!");
			keepPlaying++;
		}
		if (board[0][1].equals("X ") && board[1][1].equals("X ") && board[2][1].equals("X ")) {
			System.out.println("Player 1 wins!");
			keepPlaying++;
		}
		if (board[0][2].equals("X ") && board[1][2].equals("X ") && board[2][2].equals("X ")) {
			System.out.println("Player 1 wins!");
			keepPlaying++;
		}
		if (board[0][0].equals("X ") && board[1][1].equals("X ") && board[2][2].equals("X ")) {
			System.out.println("Player 1 wins!");
			keepPlaying++;
		}
		if (board[0][2].equals("X ") && board[1][1].equals("X ") && board[2][0].equals("X ")) {
			System.out.println("Player 1 wins!");
			keepPlaying++;
		}
	}

	public void determineOWinner() {
		if (board[0][0].equals("+ ") && board[0][1].equals("+ ") && board[0][2].equals("+ ")) {
			System.out.println("Player 2 wins!");
			keepPlaying++;
		}
		if (board[1][0].equals("+ ") && board[1][1].equals("+ ") && board[1][2].equals("+ ")) {
			System.out.println("Player 2 wins!");
			keepPlaying++;
		}
		if (board[2][0].equals("+ ") && board[2][1].equals("+ ") && board[2][2].equals("+ ")) {
			System.out.println("Player 2 wins!");
			keepPlaying++;
		}
		if (board[0][0].equals("+ ") && board[1][0].equals("+ ") && board[2][0].equals("+ ")) {
			System.out.println("Player 2 wins!");
			keepPlaying++;
		}
		if (board[0][1].equals("+ ") && board[1][1].equals("+ ") && board[2][1].equals("+ ")) {
			System.out.println("Player 2 wins!");
			keepPlaying++;
		}
		if (board[0][2].equals("+ ") && board[1][2].equals("+ ") && board[2][2].equals("+ ")) {
			System.out.println("Player 2 wins!");
			keepPlaying++;
		}
		if (board[0][0].equals("+ ") && board[1][1].equals("+ ") && board[2][2].equals("+ ")) {
			System.out.println("Player 2 wins!");
			keepPlaying++;
		}
		if (board[0][2].equals("+ ") && board[1][1].equals("+ ") && board[2][0].equals("+ ")) {
			System.out.println("Player 2 wins!");
			keepPlaying++;
		}
	}

}