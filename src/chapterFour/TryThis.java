package chapterFour;

import java.util.Scanner;

public class TryThis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter item sold");
        int userinput = scanner.nextInt();

        double totalItemSold = 0;
        while (userinput != -1) {

            System.out.println("enter item sold");
            userinput = scanner.nextInt();

            switch (userinput) {
                case 1: totalItemSold += 239.90;
                case 2: totalItemSold += 129.75;
                case 3: totalItemSold += 99.95;
                case 4: totalItemSold += 350.84;
            }
            if (userinput > 4){
                System.out.println("Wrong item number");
            }
        }
             double salary = (totalItemSold/100) * 4;
             double salaryDiscount = (totalItemSold/100) * 9;
             double totalSalary = salary+salaryDiscount;

            System.out.printf("your earning for last week is %f", totalSalary);

    }
}
