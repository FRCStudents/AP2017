class TicTacToeGo {
    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        t.setSquare('x', 0);
        t.setSquare('x', 2);
        t.setSquare('x', 6);
        t.setSquare('x', 8);
        t.showBoard();

        System.out.println();
        
        t.setSquare(' ', 0);
        t.setSquare(' ', 2);
        t.setSquare(' ', 6);
        t.setSquare(' ', 8);
        t.setSquare('o', 1);
        t.setSquare('o', 3);
        t.setSquare('o', 4);
        t.setSquare('o', 5);
        t.setSquare('o', 7);
        t.showBoard();
    }
}