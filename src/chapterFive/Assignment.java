package chapterFive;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your odd modification number: ");
        int num = input.nextInt();


        int blank = (num - 1) / 2;
        for (int i = 1; i < num; i+=2) {
            for (int j = 0; j < blank; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            blank--;
        }
        blank = 1;
        for (int i = num-2; i > 0 ; i-=2) {
            for (int j = 0; j < blank; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
            blank++;
        }

    }
}
