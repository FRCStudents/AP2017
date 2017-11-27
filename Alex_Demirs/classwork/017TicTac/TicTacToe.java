public class TicTacToe{


	char[][] x = newchar[][]{
		{'x','o','x'}
		{'o','o','o'}
		{'x','o','x'}
	}
	char[][] T = new char[3][3];




	public char getValueofBox(int x, int y){
		return T[x][y];
	}


}