package chapterFour;

import java.util.Scanner;

public class AverageGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int i = 1;
        int sum = 0;
        while (i <= 5) {
            System.out.println("enter your grade");
            int grade = scanner.nextInt();
            i++;
            sum = sum + grade;

        }
        int average = sum / i;

        System.out.printf("the average grade is %d", average);
    }
}