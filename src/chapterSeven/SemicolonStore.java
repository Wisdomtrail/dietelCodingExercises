package chapterSeven;

import java.util.Objects;
import java.util.Scanner;


public class SemicolonStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What Is The customer´s Name");
        String name = scanner.nextLine();
        String choice;
        do {
            System.out.println("What did the customer buy");
            String item = scanner.next();
            System.out.println("How many pieces");
            int itemPieces = scanner.nextInt();
            System.out.println("How much per unit");
            double itemPrice = scanner.nextDouble();
            System.out.println("Add more Items?");
            choice = scanner.next();
        }
        while (Objects.equals(choice, "yes"));
        System.out.println("What is your name");
        String cashierName = scanner.next();
        System.out.println("How much dicount will he get");
        int discount = scanner.nextInt();
        SemicolonStoreReciept.invoice(name,cashierName);
    }
}
