
class TicTacToe {

	int[][] board = new int[3][3]; 

	public TicTacToe(){
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				board[i][j] = 0;
			}
		}
	}


	public void setSquare(int x, int y, int val){
		board[x][y] = val;
	}

	public int getSquare(int x, int y){
		return board[x][y];
	}

	public void drawBoard(){
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print(getSquare(i,j) + "\t");
			}
		System.out.println();
		}
	}

}
