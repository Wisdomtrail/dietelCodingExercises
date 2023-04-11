package Diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EntryTest {

    Entry myEntry;

    @BeforeEach
    public void runClassObjectFirst(){
        myEntry = new Entry("heading","programming",2);
    }

    @Test
    public void setMyEntryTitleTest(){
        myEntry.setEntryTitle("My entry");
        assertEquals("My entry",myEntry.getEntryTitle());
    }

    @Test
    public void setMyEntryBodyTest(){
        myEntry.setEntryBody("balablu");
        assertEquals("balablu",myEntry.getEntryBody());
    }

    @Test
    public void setMyEntryId(){
        myEntry.setEntryId(2);
        assertEquals(2,myEntry.getId());
    }
}