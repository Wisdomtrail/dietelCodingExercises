package chapterThree;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);

        System.out.print("enter your name: ");
        String name = input.nextLine();

        System.out.print("your date of birth: ");
        int year = input.nextInt();

        int age  = 2022-year;

        System.out.printf("Welcome %s you are %d years old", name, age);
    }
}
