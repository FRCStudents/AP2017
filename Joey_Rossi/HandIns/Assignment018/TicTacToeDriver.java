class TicTacToeDriver {
    public static void main(String[] argv) {
        TicTacToe t = new TicTacToe();
        t.setBoard('x', 0);
        t.setBoard('x', 2);
        t.setBoard('x', 6);
        t.setBoard('x', 8);
        t.showBoard();

        System.out.println();
        
        t.setBoard(' ', 0);
        t.setBoard(' ', 2);
        t.setBoard(' ', 6);
        t.setBoard(' ', 8);
        t.setBoard('o', 1);
        t.setBoard('o', 3);
        t.setBoard('o', 4);
        t.setBoard('o', 5);
        t.setBoard('o', 7);
        t.showBoard();
    }
}