public class TicTacToe{
	String [][] board = new String [3][3];

	public void setSquare(int column, int row, String value){
		board [row][column] = value;
	}

	public void showBoard(){
		for (int i = 0; i < board.length; i ++){
			for (int j = 0; j < board.length; j++){
			System.out.print(board [i][j] + "|");
			}
			System.out.println(" ");
		}	
	}

	public String[][] getBoard(){
		return board;
	}
}