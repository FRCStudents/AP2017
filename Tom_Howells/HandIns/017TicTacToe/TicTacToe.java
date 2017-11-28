class TicTacToe {
    private Square[][] board = new Square[3][3];

    public TicTacToe() {
        for (int i = 0; i < 9; i++) {
            board[i / 3][i % 3] = new Square();
        }
    }

    public void showBoard() {
        System.out.println("+---+---+---+");
        System.out.println("| " + getSquare(0) + " | " + getSquare(1) + " | " + getSquare(2) + " |");
        System.out.println("+---+---+---+");
        System.out.println("| " + getSquare(3) + " | " + getSquare(4) + " | " + getSquare(5) + " |");
        System.out.println("+---+---+---+");
        System.out.println("| " + getSquare(6) + " | " + getSquare(7) + " | " + getSquare(8) + " |");
        System.out.println("+---+---+---+");
    }

    public Square getSquare(int idx) {
        return board[idx / 3][idx % 3];
    }

    public void setSquare(char c, int idx) {
        board[idx / 3][idx % 3].setType(c);
    }
}