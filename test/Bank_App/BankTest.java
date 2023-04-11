package Bank_App;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    public Bank wemaBank;

    @BeforeEach
    public void runThisFirst() {
        wemaBank = new Bank();
        wemaBank.createAccountFor("Daniel", "Adebayo", "5566");
    }

    @Test
    public void createAccountTest() {
        assertEquals(1, wemaBank.getNumberOfCustomer());
    }

    @Test
    public void creatTwoAccountTest() {
        wemaBank.createAccountFor("Daniel", "Adebayo", "5566");
        assertEquals(2, wemaBank.getNumberOfCustomer());
    }

    @Test
    public void depositMoneyTest() {
        wemaBank.depositMoney(1,BigDecimal.valueOf(2000),"5566");
        assertEquals(BigDecimal.valueOf(2000), wemaBank.getBalance(1,"5566"));
    }

    @Test
    public void withdrawMoneyTest() {
        wemaBank.depositMoney(1,BigDecimal.valueOf(2000),"5566");
        wemaBank.withdrawMoney(1,BigDecimal.valueOf(300),"5566");
        assertEquals(BigDecimal.valueOf(1700), wemaBank.getBalance(1,"5566"));
    }

    @Test
    public void findAccountTest() {
        String expected = """
               =====================
               Account Name: Daniel Adebayo
               Account Number: 1
               Account Balance: 0
               =====================""";
        assertEquals(expected, wemaBank.find_Account(1).toString());
    }

    @Test
    public void transferMoneyTest(){
        wemaBank.depositMoney(1,BigDecimal.valueOf(2000),"5566");
        wemaBank.createAccountFor("pauline", "obi","4444");
        assertEquals(BigDecimal.valueOf(1600), wemaBank.getBalance(1,"4444"));
    }
}
