class TicTacToeDriver {
	public static void main(String[] argv) {

		TicTacToe t = new TicTacToe();

		t.emptyBoard();
		t.setCorners();
		t.printBoard();
		t.emptyBoard();
		t.setCross();
		t.printBoard();
		t.emptyBoard();
		t.setCross();
		t.setCorners();
		t.printBoard();
		t.emptyBoard();
	}
}