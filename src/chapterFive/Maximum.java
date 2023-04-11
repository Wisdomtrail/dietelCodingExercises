package chapterFive;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of times you want to enter a number ");
            int num = scanner.nextInt();

            int largest = 0;
            int smallest = 999999999;
            int counter = 1;
            do {
                System.out.println("enter number " + counter);
                int number = scanner.nextInt();

                if (number > largest )
                    largest = number;
                if (number < smallest)
                    smallest = number;

                num--;
                counter++;
            }
            while (num > 0);
        System.out.printf("the largest is %d, and the smallest is %d%n",largest, smallest);
        System.out.printf("the sum is %d", largest+smallest);
    }
}
