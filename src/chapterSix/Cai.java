package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class Cai {

    public static void Questions() {
        Scanner scanner = new Scanner(System.in);

        int user_Answer;
        int ans;
        SecureRandom secureRandom = new SecureRandom();
        int user_score = 0;
        int counter = 0;
        int random_Numbers;
        do {
            random_Numbers = secureRandom.nextInt(1, 10);
            int nd_random_Numbers = secureRandom.nextInt(1, 10);
            System.out.printf("how much is %d times %d%n", random_Numbers, nd_random_Numbers);
            user_Answer = scanner.nextInt();
            ans = random_Numbers * nd_random_Numbers;

            if (user_Answer == ans) {
                user_score += 1;
                int count = secureRandom.nextInt(1, 5);
                if (count == 1)
                    System.out.println("Very Good");
                if (count == 2)
                    System.out.println("Excellent!");
                if (count == 3)
                    System.out.println("Nice work!");
                if (count == 4)
                    System.out.println("Keep up the good work!");

            }
            if (user_Answer != ans) {
                int count = secureRandom.nextInt(1, 5);
                if (count == 1) {
                    System.out.println("No. Please Try again");
                }
                if (count == 2) {
                    System.out.println("Wrong. Try once more.");
                }
                if (count == 3) {
                    System.out.println("Don't give up!");
                }
                if (count == 4) {
                    System.out.println("No. Keep trying.");
                }
            }
            counter += 1;
        }
        while (counter < 10);
        if (user_score > 7)
            System.out.println("Congratulations, you are ready to go to the next level!");
        else
            System.out.println("Please ask your teacher for extra help.");
    }
}
