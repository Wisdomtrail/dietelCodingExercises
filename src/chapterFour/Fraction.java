package chapterFour;

import java.util.Scanner;

public class Fraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = input.nextFloat();

        double count = 1;
        double result = 0;
        double lcm = 1;
        double numerator = 0;

        while (count <= num) {
            result = result + (1 / count);
            lcm =  lcm * count;
            numerator = numerator + (lcm / count);
            count++;
            System.out.println(lcm);

        }
        System.out.println(numerator +"/" + lcm);
        System.out.println(result);

    }
}
