package chapterSix;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Guess {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int num;


        int choice;
        do {
            System.out.println("""
                    1.play Game
                    2.Quit Game""");
            choice = scanner.nextInt();

            if (choice == 2) {
                break;
            }
            int count = 0;
            int rand = random.nextInt(10);
            for (int i = choice; i != rand; i++) {
                System.out.println("guess a number between 1 to 10");
                num = scanner.nextInt();
                count += 1;
                if (num > rand) {
                    System.out.println("Too high");
                } else if (num < rand) {
                    System.out.println("Too Low");
                }
            }
            System.out.println("congrats");
            if (count < 10) {
                System.out.println("Either you know the secret or you got lucky!");
            } else if (count == 10) {
                System.out.println(" display Aha! You know the secret!");
            } else System.out.println(" You should be able to do better!");
        }
        while (choice == 1);
        System.out.print("Quiting Game");
        for (int i = 0; i < 4; i++) {
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
        }

    }
}