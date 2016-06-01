import java.util.Arrays;

public class Board {

    char[][] board = new char[3][3];
    Player playerX;
    Player playerO;
    Player currentPlayer;

    public Board(Player playerX, Player playerO) {
        for (int i = 0; i < 3; i++) {
            Arrays.fill(board[i], ' ');
        }

        this.playerX = playerX;
        this.playerO = playerO;
        currentPlayer = playerX;
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println("------");
            for (int j = 0; j < 3; j++) {

                System.out.print(" " + board[i][j]);
            }
            System.out.println();
        }
    }

    public boolean gameFinished() {
        for (int y = 0; y < 3; y++) {
            if (board[y][0] == 'X' && board[y][1] == 'X' && board[y][2] == 'X') {
                return true;
            }
        }
        for (int x = 0; x < 3; x++) {

            if (board[0][x] == 'X' && board[1][x] == 'X' && board[2][x] == 'X') {
                return true;
            }
        }

        for (int y = 0; y < 3; y++) {
            if (board[y][0] == 'O' && board[y][1] == 'O' && board[y][2] == 'O') {
                return true;
            }
        }
        for (int x = 0; x < 3; x++) {

            if (board[0][x] == 'O' && board[1][x] == 'O' && board[2][x] == 'O') {
                return true;
            }
        }

        return false;
    }

    public boolean makeMove() {
        String move = currentPlayer.makeMove();
        int x = Character.getNumericValue(move.charAt(0));
        int y = Character.getNumericValue(move.charAt(1));

        if (!isMoveValid(x, y))
            return false;

        board[x][y] = currentPlayer.getType();
        changeCurrentPlayer();

        return true;
    }

    private void changeCurrentPlayer() {

        if (currentPlayer.getType() == 'X') {
            currentPlayer = playerO;
        } else {
            currentPlayer = playerX;
        }
    }

    private boolean isMoveValid(int x, int y) {
        if (x > 2 || y > 2 || x < 0 || y < 0 || board[x][y] == 'X' || board[x][y] == 'O') {
            return false;
        }
        return true;
    }

    public Player calculateWinner() {
        return currentPlayer;
    }

    public Player calculateLoser() {
        return currentPlayer;
    }
}