package chapterSix;

import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter three spaced numbers ");
        int  num1 =  scanner.nextInt();
        int  num2 = scanner.nextInt();
        int  num3 = scanner.nextInt();

        System.out.printf("the largest is %d",maximum(num1, num2, num3 ));
    }

   private static int maximum(int a, int b, int c){
        int maximumNumber = a;
        if(b > maximumNumber)
            maximumNumber = b;
        if(c > maximumNumber)
            maximumNumber = c;
        return maximumNumber;
    }
}
