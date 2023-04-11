package chapterSix;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number of asterisk");
        int num = scanner.nextInt();

        System.out.println(squareOfAsterisks(num));

    }
    public static String squareOfAsterisks(int a){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        return "";
    }
}
