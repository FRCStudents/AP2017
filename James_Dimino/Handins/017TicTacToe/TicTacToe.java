public class TicTacToe{
	
	private String[][] board = {{"-","-","-"},
								{"-","-","-"},
								{"-","-","-"}};

		public void showBoard(){
			for (int row = 0; row < board.length; row++){
				for (int col = 0; col < board.length; col++){
					System.out.print(board[row][col] + " ");
				}
			System.out.println();
			}
		}

		public String getSquare(int row, int col){
			return board[row][col];
		}

		public void setX(int row, int col){
			board[row][col] = "X";
		}

		public void setO(int row, int col){
			board[row][col] = "O";
		}

		public void setSquare(String piece, int row, int col){
			board[row][col] = piece;
		}

}