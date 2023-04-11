package chapterFour;

import java.util.Scanner;

public class Player {
    /* public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age, now!!");
        int age = scanner.nextInt();
        String resolve = age == 50? sugarDaddyMode() : sugarBoyMode();
         System.out.println(resolve);
     }

     private static String sugarBoyMode() {
         System.out.println("doing sugar things");
         return "sugar boy things";
     }

     private static String sugarDaddyMode() {
         System.out.println("doing sugar things");
         return "sugar daddy things";
     }
 }
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1. GoalKeeper
                2. Defender
                3. Defender
                4. Defender
                5. Defender
                6. Midfielder
                7. Midfielder
                8. Midfielder
                9. Attacker
                10.Attacker
                11.Attacker
                """);

        System.out.println("Enter a player number from 1 to 11");
             String num = scanner.next();
             switch (num){
                 case "1":
                     System.out.println("GoalKeeper");
                     break;
                 case "2":
                 case "3":
                 case "4":
                 case "5":
                     System.out.println("Defender");
                     break;
                 case "6":
                 case "7":
                 case "8":
                     System.out.println("Midfielder");
                     break;
                 case "9":
                 case "10":
                 case "11":
                     System.out.println("Attacker");
                     break;
                 default:
                     System.out.println("i said enter a number from 1 to 11");

             }

    }
}

