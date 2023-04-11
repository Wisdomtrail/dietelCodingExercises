package Bank_App;

import java.math.BigDecimal;
import java.util.Objects;

public class Account{

    private BigDecimal balance = BigDecimal.ZERO;
    private String pin = "1234";
    private final String name;
    private final int accountNumber;

    Account(int accountNumber, String AccountName, String accountPin){
        this.pin = accountPin;
        this.name = AccountName;
        this.accountNumber = accountNumber;

    }

    public void depositMoney(BigDecimal amount){
        balance = balance.add(amount);
    }

    public BigDecimal getBalance(String pin){
        validate(pin);
        return balance;
    }

    public void validate(String pin){
        if (!Objects.equals(this.pin, pin)) throw new IllegalArgumentException("Invalid pin");
    }
    public void withdrawMoney(BigDecimal amount) {
        validateMoneyToWithdraw(amount);
    }

    public void validateMoneyToWithdraw(BigDecimal amount) {
       if (balance.compareTo(amount) > 0){
           balance = balance.subtract(amount);
       }
    }


    @Override
    public String toString(){
        return String.format("""
                =====================
                Account Name: %s
                Account Number: %s
                Account Balance: %s
                =====================""",name, accountNumber,balance.toPlainString());
    }
}