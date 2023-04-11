package chapterFour;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num1 = input.nextInt();
        System.out.println("Enter another number: ");
        int num2 = input.nextInt();

        if (num1 == num2){
            System.out.println("They are Equal");
        } else if (num1 > num2) {
            System.out.println("your first number is greater");
        }
        else System.out.println("your second number is greater");
    }
}
