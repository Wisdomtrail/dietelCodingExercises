package chapterSix;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter two spaced numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(isMultiple(num1, num2));

    }

    private static boolean isMultiple(int a, int b) {
        return a % b == 0 || b % a == 0;
    }
}
