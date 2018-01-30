public class TicTacToe{
	String [][] board = new String [3][3];

	public void setSquare(int col, int row, String value){
		board [row][col] = value;
	}
	
	
	public void displayBoard(){
		System.out.println(" " + board [0][0] + " | " + board [0][1] + " | " + board [0][2] + " " );
		System.out.println("---+---+---");
		System.out.println(" " + board [1][0] + " | " + board [1][1] + " | " + board [1][2] + " " );
		System.out.println("---+---+---");
		System.out.println(" " + board [2][0] + " | " + board [2][1] + " | " + board [2][2] + " " );
	}

	public String[][] getBoard(){
		return board;
	}
}
