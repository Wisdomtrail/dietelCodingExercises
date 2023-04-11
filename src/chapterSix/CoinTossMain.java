package chapterSix;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CoinTossMain {

    private static final CoinTossGame game = new CoinTossGame();

    public static void main(String[] args) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        System.out.println(CoinTossGame.getGameMenu());
        int usersInput = scanner.nextInt();
        do {
            if (usersInput == 1){
                game.flip();
            }
            System.out.println(CoinTossGame.getGameMenu());
            usersInput = scanner.nextInt();
        } while (usersInput == 1);
        goodbye();
    }

    private static void goodbye() throws InterruptedException {
        game.displayGameResult();
        System.out.print("Shutting Down");
        for (int counter = 0; counter < 3; counter++) {
           TimeUnit.SECONDS.sleep(1);
           System.out.print(".");
        }
    }
}
