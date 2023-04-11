package tdd;

import java.util.Scanner;
public class GameMain {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner scanner = new Scanner(System.in);

        while (!game.isGameFinished()) {
            System.out.println("Current player: " + game.currentPlayerMark);
            game.printBoard();
            System.out.println("Enter row and column (separated by a space) to place your mark:");

            int row = scanner.nextInt();
            int col = scanner.nextInt();
            game.placeMark(row, col);
        }

        scanner.close();
    }
}
