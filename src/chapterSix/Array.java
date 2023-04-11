package chapterSix;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many scores do you want to add");
            int numberOfScores = scanner.nextInt();

            int[] scores = new int[numberOfScores];

            int sum = 0;

        for (int index = 0; index < numberOfScores; index++) {
            System.out.println("Enter a score" + (index+1));
                int score = scanner.nextInt();
                scores[index] = score;

        }

        for (int score : scores) {
            sum += score;
        }
        System.out.printf("the sum is %d",sum);


    }
}
