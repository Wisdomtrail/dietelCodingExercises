package chapterFour;

import java.util.Scanner;

public class Acc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1. 2000
                2. 5000
                3. 10000
                4. 15000
                5. 20000
                6. other amount
                """);

        System.out.println("enter your withdrawal amount");
        int num = scanner.nextInt();

        switch (num) {
            case 1 -> System.out.println("successfully withdraw 2k");
            case 2 -> System.out.println("successfully withdraw 5k");
            case 3 -> System.out.println("successfully withdraw 10k");
            case 4 -> System.out.println("successfully withdraw 15k");
            case 5 -> System.out.println("successfully withdraw 20k");
            case 6 -> {
                System.out.println("enter amount");
                String amount = scanner.next();
                handleOtherAmount(amount);
            }
        }
    }

    private static void handleOtherAmount(String amount) {
        System.out.println("successfully withdrawn " +amount+"k");
    }
}
