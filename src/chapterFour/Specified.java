package chapterFour;

import java.util.Scanner;

public class Specified {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number, until your numbers sum is greater than your first number");
            int num = input.nextInt();

        int result = 0;
        do {
            System.out.println("Enter a number");
             int num2 = input.nextInt();

             result+=num2;
        }

        while (num > result);

    }
}