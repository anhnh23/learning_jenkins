package app;

public class TicTacToe {
    int[][] board = new int[3][3];

    public void play(int x, int y) {
        if(x < 1 || x > 3) throw new RuntimeException("X is outside the board.");
        if(y < 1 || y > 3) throw new RuntimeException("Y is outside the board");
    }
}
