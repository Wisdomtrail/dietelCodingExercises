package Bank_App;

import javax.swing.*;
import java.math.BigDecimal;


public class ATMmachine {
    public static void main(String[] args) {
        gotoMainMenu();
    }
private static final Bank bank = new Bank();
    private static void gotoMainMenu() {
        String mainMenu = """
                      =========================
                      Welcome to GTB Bank
                      1 -> Create Account
                      2 -> Deposit
                      3 -> Withdraw
                      4 -> Transfer
                      5 -> Check Balance
                      6 -> Exit
                      =========================
                """;
        String userInput = sout(mainMenu);
        switch(userInput){
            case "1" -> createAccount();
            case "2" -> deposit();
            case "3" -> withdraw();
            case "4" -> transfer();
            case "5" -> checkBalance();
            case "6" -> exitApplication();
            default  -> gotoMainMenu();
        }
    }

    private static void exitApplication() {
        System.exit(1);
        display("Thank you for Using our Application");
    }

    private static void withdraw() {
        int accountNumber = Integer.parseInt(sout("enter Account Number"));
        BigDecimal amount = BigDecimal.valueOf(Double.parseDouble(sout("enter amount")));
        String pin = sout("enter your pin");
        bank.withdrawMoney(accountNumber,amount,pin);
        display("You have successfully withdrawn "+amount);
        gotoMainMenu();
    }

    private static void transfer(){

    }

    private static void checkBalance() {
        int AccountNumber = Integer.parseInt(sout("enter Account Number"));
        String pin = sout("enter your pin");
        BigDecimal balance = bank.getBalance(AccountNumber,pin);
        display(String.valueOf(balance));
        gotoMainMenu();
    }

    private static void deposit() {
        int accountNumber = Integer.parseInt(sout("Enter your Account Number"));
        BigDecimal amount = BigDecimal.valueOf(Double.parseDouble(sout("enter amount")));
        String pin = sout("Enter your pin");
        bank.depositMoney(accountNumber,amount,pin);
        display("Successfully Deposited "+ amount);
        gotoMainMenu();
    }

    private static void createAccount() {
         String firstname = sout("enter your first name");
         String secondName = sout("enter your second name");
         String pin = sout("create four digit pin");
         bank.createAccountFor(firstname,secondName,pin);
         display("Account created successfully");
         gotoMainMenu();
    }

    private static String sout(String prompt){
        return JOptionPane.showInputDialog(prompt);
    }

    private static void display(String prompt){
        JOptionPane.showMessageDialog(null,prompt);
    }
}


