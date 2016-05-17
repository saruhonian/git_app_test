package Game;

import java.util.Arrays;

public class Board {

    char[][] board = new char[3][3];
    char currentPlayer;

    public Board() {
        for (int i = 0; i < 3; i++) {
            Arrays.fill(board[i], ' ');
        }
        currentPlayer = 'X';
    }

    public void printBoard() {
        System.out.println("┌──┐");
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {


                System.out.print(" " + board[i][j]);

            }
            System.out.println();

        }
        System.out.println("└──┘");
    }

    public boolean gameFinished() {

        char cp = (currentPlayer == 'X') ? 'O' : 'X';

        for (int n = 0; n < 3; n++) {
            if (board[n][0] == cp && board[n][1] == cp && board[n][2] == cp)
            return true;
        }

        for (int r = 0; r < 3; r++) {
            if (board[0][r] == cp && board[1][r] == cp && board[2][r] == cp)
            return true;
        }

        if (board[0][0] == cp && board[1][1] == cp && board[2][2] == cp)
        return true;

        if (board[2][0] == cp && board[1][1] == cp && board[0][2] == cp)
            return true;
        /*
        if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') {
            return true;
        }

        if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') {
            return true;
        }

        if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') {
            return true;
        }*/
        return false;
    }

    public boolean makeMove(String move) {
        int x = Character.getNumericValue(move.charAt(0));
        int y = Character.getNumericValue(move.charAt(1));

        if (!isMoveValid(x, y))
            return false;

        board[x][y] = currentPlayer;
        changeCurrentPlayer();

        return true;
    }

    private void changeCurrentPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }

    private boolean isMoveValid(int x, int y) {
        if (x > 2 || y > 2 || x < 0 || y < 0) {
            return false;
        }
        return true;
    }

    public char calculateWinner() {
        return 'X';
    }
}