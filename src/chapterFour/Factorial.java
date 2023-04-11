package chapterFour;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        int result = 1;
      while (num > 0){
          result = result*num;
          System.out.printf(" %d",num);
          num--;
      }
        System.out.printf(" = %d",result);
    }
}
