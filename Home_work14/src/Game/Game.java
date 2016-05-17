package Game;
import java.io.Console;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Game started...");
        Player playerX;

        Board board = new Board();
        board.printBoard();

        while (!board.gameFinished()) {
            System.out.println("Player " + board.currentPlayer + " moves...");
            System.out.print("Enter your move: ");
            String move = console.next();
            if (!board.makeMove(move)) {
                System.out.println("Input was incorrect. Repeat your move.");
            }

            board.printBoard();
        }

        System.out.println("The winner is " + board.calculateWinner());
    }
}