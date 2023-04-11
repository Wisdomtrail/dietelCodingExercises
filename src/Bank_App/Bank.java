package Bank_App;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Objects;

public class Bank{

    ArrayList<Account> accounts = new ArrayList<>();

    private String pin;

    private BigDecimal balance = BigDecimal.ZERO;

    public void createAccountFor(String firstName,String lastName, String pin) {
        this.pin = (pin);
        int accountNumber = accounts.size()+1;
        Account account = new Account(accountNumber,firstName+" "+ lastName, pin);
        accounts.add(account);
    }
    public int getNumberOfCustomer() {
        return accounts.size();
    }

    public Account find_Account(int accountNumber) {
        return accounts.get(accountNumber-1);
    }

    public void depositMoney(int accountNumber, BigDecimal amount, String pin) {
        find_Account(accountNumber);
        if (balance.compareTo(amount) > 0){
            balance = balance.subtract(amount);
        }
        validatePin(pin);
        balance = balance.add(amount);
    }

    public void withdrawMoney(int accountNumber, BigDecimal amount, String pin) {
        find_Account(accountNumber);
        validatePin(pin);
        balance = balance.subtract(amount);
    }
    public void validatePin(String pin){
        if (!Objects.equals(this.pin, pin)) throw new IllegalArgumentException("Invalid pin");
    }


    public BigDecimal getBalance(int accountNumber, String pin) {
        find_Account(accountNumber);
        validatePin(pin);
        return balance;
    }


    public void transferMoney(int senderAccountNumber, int receiverAccountNumber, BigDecimal amount, String pin){
        validatePin(pin );
        find_Account(senderAccountNumber);
        balance = balance.subtract(amount);
        find_Account(receiverAccountNumber);
    }
}