package chapterSix;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter any number");
        int num = scanner.nextInt();

       int ans = IsPalindrome(num);

        System.out.println(ans);

    }
    private static int IsPalindrome(int a){
        int second = a%10;

        int divide = 1;
      while (a > 9){
          a = a/10;
          divide = divide*10;
      }
      if (a == second)
          System.out.println("it is a palindrome");
      else System.out.println("it is not a palindrome");

      return  a;
    }
}
