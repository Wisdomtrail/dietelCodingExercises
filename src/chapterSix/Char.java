package chapterSix;

import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number and character");
        int num = scanner.nextInt();
        char fill = scanner.next().charAt(0);
        System.out.println(squareOfChar(num, fill));
    }

    private static String squareOfChar(int a, char b){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(b);
            }
            System.out.println();
        }
        return " ";
    }
}
