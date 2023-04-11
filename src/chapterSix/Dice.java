package chapterSix;

import java.security.SecureRandom;

public class Dice {

    private enum GameStatus{WON, LOST, CONTINUE}

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        GameStatus status;
        int sumOfDice = RollDice();
        int myPoint = 0;
        switch (sumOfDice) {
            case SEVEN:
            case YO_LEVEN:
                status = GameStatus.WON;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                status = GameStatus.LOST;
            default:
                status = GameStatus.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("point is %d%n", myPoint);
                break;
        }
        while (status == GameStatus.CONTINUE){
            sumOfDice = RollDice();

            if (sumOfDice == myPoint){
                status = GameStatus.WON;
                System.out.println("Player Won");
            } else if (sumOfDice == SEVEN) {
                status = GameStatus.LOST;
                System.out.println("player lost");
            }
        }
    }

    private static int RollDice(){
        SecureRandom secureRandom = new SecureRandom();
        int sum;
        int die1 = 1 + secureRandom.nextInt(6);
        int die2 = 1 + secureRandom.nextInt(6);
        sum = die1+die2;
        System.out.printf("player played %d and %d,sum is %d%n", die1,die2, sum);
        return sum;
    }
}
