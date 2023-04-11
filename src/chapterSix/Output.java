package chapterSix;

import java.util.Scanner;

public class Output {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int positive = 0;
        int negative = 0;
        float total = 0;
        double numOfTotal;


        do {
            System.out.println("Enter an integer, the input ends if it is 0");
              num = input.nextInt();



            if (num > 0){
                positive+=1;
            }
            if (num < 0) {
                negative += 1;
            }
            total+=num;

             numOfTotal = positive+negative;
        }
        while (num != 0);
        System.out.printf("number of positives entered is %d%n ",positive);
        System.out.printf("number of negatives entered is %d%n ",negative);
        System.out.printf("the total is %.2f%n", total);
        System.out.printf("The average is %.2f", total/numOfTotal);

    }
}