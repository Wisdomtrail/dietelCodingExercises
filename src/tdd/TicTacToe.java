package tdd;

public class TicTacToe {
    private final char[][] board = new char[3][3];
    char currentPlayerMark;
    private boolean gameFinished;

    public TicTacToe() {
        currentPlayerMark = 'X';
        gameFinished = false;
        initializeBoard();
    }

    private void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
    }

    public void printBoard() {
        System.out.println("-------------");
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public boolean isBoardFull() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkForWin() {
        // Check rows for a win
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == board[row][1] && board[row][1] == board[row][2] && board[row][0] != '-') {
                return true;
            }
        }

        // Check columns for a win
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == board[1][col] && board[1][col] == board[2][col] && board[0][col] != '-') {
                return true;
            }
        }

        // Check diagonals for a win
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
            return true;
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != '-') {
            return true;
        }

        return false;
    }

    public void changePlayer() {
        if (currentPlayerMark == 'X') {
            currentPlayerMark = 'O';
        } else {
            currentPlayerMark = 'X';
        }
    }

    public void placeMark(int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Invalid input. Row and column must be between 0 and 2.");
            return;
        }

        if (board[row][col] != '-') {
            System.out.println("That cell is already occupied. Please try again.");
            return;
        }

        board[row][col] = currentPlayerMark;
        changePlayer();

        if (checkForWin()) {
            System.out.println("Congratulations! Player " + currentPlayerMark + " has won the game.");
            gameFinished = true;
        } else if (isBoardFull()) {
            System.out.println("It's a tie!");
            gameFinished = true;
        }
    }

    public boolean isGameFinished() {
        return gameFinished;
    }
}
