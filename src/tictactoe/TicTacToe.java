//package tictactoe;
//
//import javax.swing.*;
//
//public class TicTacToe {
//    private final char[][] board = new char[3][3];
//    private static String userName;
//    char currentPlayerMark;
//    private boolean gameFinished;
//
//    public TicTacToe() {
//        currentPlayerMark = 'X';
//        gameFinished = false;
//        initializeBoard();
//    }
//
//    private void initializeBoard() {
//        for (int row = 0; row < 3; row++) {
//            for (int col = 0; col < 3; col++) {
//                board[row][col] = '-';
//            }
//        }
//    }
//
//    public static void GameMenu(){
//         userName = sout("enter your name");
//        display("welcome "+userName);
//        String userInput = sout("""
//                1. goto game
//                2. exit game""");
//        switch (userInput){
//            case "1": gotoGame();
//            case "2": exitApp();
//            default:GameMenu();
//        }
//    }
//
//    public static void gotoGame() {
//        String userInput = sout("""
//                1. check game Instructions
//                2. Skip to Game""");
//        switch (userInput){
//            case "1": Instruction();
//            case "2": PlayGame();
//            default: gotoGame();
//        }
//    }
//
//    public static void PlayGame() {
//        TicTacToe game = new TicTacToe();
//        while (!game.isGameFinished()) {
//            System.out.println(("Current player: " + game.currentPlayerMark);
//            game.printBoard();
//            int userInput = Integer.parseInt(("Enter a number at which you want to play"));
//
//            game.placeMark(userInput);
//        }
//    }
//
//    private void placeMark(int input) {
//        if (input < 1 || input > 9) {
//            System.out.println("Invalid input. number should be between 1 and 9");
//            return;
//        }
//
//        if (board[input] != '-') {
//            System.out.println("That cell is already occupied. Please try again.");
//            return;
//        }
//
//        board[row][col] = currentPlayerMark;
//        changePlayer();
//
//        if (checkForWin()) {
//            System.out.println("Congratulations! Player " + currentPlayerMark + " has won the game.");
//            gameFinished = true;
//        } else if (isBoardFull()) {
//            System.out.println("It's a tie!");
//            gameFinished = true;
//        }
//    }
//
//    private void printBoard() {
//        System.out.println("-------------");
//        for (int row = 0; row < 3; row++) {
//            System.out.print("| ");
//            for (int col = 0; col < 3; col++) {
//                System.out.print(board[row][col] + " | ");
//            }
//            System.out.println();
//            System.out.println("-------------");
//        }
//    }
//
//    private boolean isGameFinished() {
//        return gameFinished;
//    }
//
//    public static void Instruction() {
//        System.out.println( """
//                1.Pick between X and O
//                2.play until your character forms
//                 a)vertical line
//                 b)horizontal line
//                 c)slant line or a slope""");
//        PlayGame();
//    }
//
//    public static void exitApp(){
//        System.exit(1);
//        System.out.println(("Thank you for playing sunepa game");
//    }
//}
