package Phone;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {

    private PhoneBook phoneBook;

    @BeforeEach
    public void runThisFirst(){
        phoneBook  = new PhoneBook();
        phoneBook.addContact("sunday", "08134132226");
    }

    @Test
    public void CreateAccountTest(){
        assertEquals(1,phoneBook.Contact_List());
    }

    @Test
    public void FindAccountTest(){
        String expected = """
                =========================
                Contact Name: sunday
                PhoneNumber: 08134132226
                =========================
                """;
        assertEquals(expected, phoneBook.Find_contacts("sunday").toString());
    }

    @Test
    public void deleteContactTest(){
        phoneBook.deleteContact("sunday");
        assertEquals(0,phoneBook.Contact_List());
    }

    @Test
    public void getNumberOfContactsTest(){
        assertEquals(1,phoneBook.Contact_List());
    }
}