package chapterFour;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 5 didgit integer");
        int num = input.nextInt();

        while (num <= 10000 || num >= 99999) {
            System.out.println("mumu enter 5 digit integer");
             num = input.nextInt();
        }
            int get = num % 10;
            int confirm = num / 10000;

            if (get == confirm) {
                System.out.println("It is a Palindrome");
            } else
                System.out.println("it is not a palindrome");


    }
}