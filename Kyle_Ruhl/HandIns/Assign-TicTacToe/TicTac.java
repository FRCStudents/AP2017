//TicTacToe Board situation Kyle Ruhl

public class TicTac{
	String [][] board = new String [3][3]; //2D array

	public void setSquare(int col, int row, String value){
		//this method's values are set in the driver, TicTacGo.java
		board [row][col] = value;
	}
	
	
	public void displayBoard(){
	/*
	*This method displays what the board will look like in the command prompt when ran.
	*Should have lines that make up the 9 squares on the board.
	*Then puts the X's where they should be.
	*
	*The value of the array is set in my driver (TicTacGo.java)
	*/
		System.out.println("_____________");
		System.out.println("| " + board [0][0] + " | " + board [0][1] + " | " + board [0][2] + " |" );
		System.out.println("-------------");
		System.out.println("| " + board [1][0] + " | " + board [1][1] + " | " + board [1][2] + " |" );
		System.out.println("-------------");
		System.out.println("| " + board [2][0] + " | " + board [2][1] + " | " + board [2][2] + " |" );
		System.out.println("_____________");
	}

	public String[][] getBoard(){
		return board;
	}
}
