import java.util.*;

class TicTacToe {
    private Board[][] board = new Board[3][3];

    public TicTacToe() {
        for (int i = 0; i < 9; i++) {
            board[i / 3][i % 3] = new Board();
        }
    }

    public void showBoard() {
        System.out.println("+---+---+---+");
        System.out.println("| " + getBoard(0) + " | " + getBoard(1) + " | " + getBoard(2) + " |");
        System.out.println("+---+---+---+");
        System.out.println("| " + getBoard(3) + " | " + getBoard(4) + " | " + getBoard(5) + " |");
        System.out.println("+---+---+---+");
        System.out.println("| " + getBoard(6) + " | " + getBoard(7) + " | " + getBoard(8) + " |");
        System.out.println("+---+---+---+");
    }

    public Board getBoard(int idx) {
        return board[idx / 3][idx % 3];
    }

    public void setBoard(char c, int idx) {
        board[idx / 3][idx % 3].setType(c);
    }
}