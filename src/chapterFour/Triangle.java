package chapterFour;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the base length of a triangle between 1 to 10");
        int num = input.nextInt();
        int blank = num;
        while (num < 10) {
            for (int i = 1; i <= num; i += 1) {
                for (int k = 0; k < blank; k++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(" *");
                }
                System.out.println();
                blank--;
            }
        }
    }
}


