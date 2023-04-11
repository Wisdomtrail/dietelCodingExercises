package Diary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DiaryTest {

    private Diary diary;

    @BeforeEach
    public void runClassObject(){
        diary = new Diary();
        diary.createEntry( "programming", "my first java code");
    }


    @Test
    public void createEntryTest(){
        diary.createEntry( "programming", "my first java code");
        Assertions.assertEquals(2,diary.getNumberOfEntries());
    }


    @Test
    public void findEntryTest(){
        String expected = """
                ===========================
                EntryTitle: programming
                EntryBody: my first java code
                EntryId: 1
                ===========================
                """;
        Assertions.assertEquals(expected, diary.view_entry(1).toString());
    }

    @Test
    public void editEntryTest(){
        String expected = """
                ===========================
                EntryTitle: program
                EntryBody: my second code
                EntryId: 1
                ===========================
                """;
        diary.editEntry(1,"program","my second code");
        Assertions.assertEquals(expected,diary.view_entry(1).toString());
    }

    @Test
    public void deleteEntryTest(){
        diary.deleteEntry(1);
        Assertions.assertEquals(0,diary.getNumberOfEntries());
    }


    @Test
    public void lockDiaryTest(){
        diary.lockDiary();
        Assertions.assertTrue(diary.isLocked());
    }
}