package Bank_App;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    private Account sundayAccount;
    @BeforeEach
    public void TestPinFirst(){
       sundayAccount = new Account(1,"sunday", "1234");
    }

    @Test
    public void depositMoney(){
        sundayAccount.depositMoney(BigDecimal.valueOf(2000));
        assertEquals(BigDecimal.valueOf(2000),sundayAccount.getBalance("1234"));
    }

    @Test
    public void Withdraw_With_WrongPin_ThrowsException(){
         sundayAccount.depositMoney(BigDecimal.valueOf(2000));
         assertThrows(IllegalArgumentException.class, ()->sundayAccount.getBalance("2231"));
    }

    @Test
    public void withdraw_With_Correct_Pin(){
        sundayAccount.depositMoney(BigDecimal.valueOf(2000));
        sundayAccount.withdrawMoney(BigDecimal.valueOf(1500));
        assertEquals(BigDecimal.valueOf(500), sundayAccount.getBalance("1234"));
    }

    @Test
    public void withdraw_more_than_balance(){
        sundayAccount.depositMoney(BigDecimal.valueOf(1000));
        sundayAccount.withdrawMoney(BigDecimal.valueOf(3000));
        assertEquals(BigDecimal.valueOf(1000), sundayAccount.getBalance("1234"));
    }
}