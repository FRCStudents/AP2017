public class TicTacToeDriver{
	public static void main(String[] args){

		TicTacToe t = new TicTacToe();

		t.setX(1,1);
		t.setO(2,2);
		t.setSquare("O",0,0);

		t.showBoard();

	}
}