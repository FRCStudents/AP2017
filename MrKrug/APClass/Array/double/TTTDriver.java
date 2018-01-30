
class TTTDriver {
	static TicTacToe TTT = new TicTacToe();
	public static void main(String[] argv){
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				TTT.setSquare(i,j,2);
			}
		}

		TTT.setSquare(0,0,1);
		TTT.setSquare(0,2,1);
		TTT.setSquare(2,0,1);
		TTT.setSquare(2,2,1);
		TTT.drawBoard();
	}
}
