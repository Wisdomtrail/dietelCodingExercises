package chapterFive;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of times you want to enter a number");
        int num = input.nextInt();

        int num1 = 0;
        int largest = num1;
        int smallest = num1;


        do {
            System.out.println("Enter a number ");
                num1 = input.nextInt();

             if (num1 > largest){
                 largest = num1;
             }
             else if (num1 < largest){
                 smallest = num1;
             }
            num--;
        }

        while (num > 0);
        System.out.printf("The maximum number is %d and the minimum number is %d%n",largest, smallest);
        System.out.printf("the sum of the two is %d", largest+smallest);
    }
}

