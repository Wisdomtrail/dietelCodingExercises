package Diary;

import javax.swing.*;


public class Diary_Main {

    private static final Diary diary = new Diary();

    public static void main(String[] args)  {
        mainMenu();
    }


    private static void mainMenu() {

       String MainMenu = """
                1.Create Entry
                2.View Entry
                3.Edit Entry
                4.Delete Entry
                5.Number of Entries
                6.Exit Diary""";
        String userInput = sout(MainMenu);
       switch (userInput){
           case "1"->Diary_Main.createEntry();
           case "2"->Diary_Main.viewEntry();
           case "3"->Diary_Main.EditEntry();
           case "4"->Diary_Main.deleteEntry();
           case "5"->Diary_Main.getNumberOfEntries();
           case "6"->exitApplication();
           default -> mainMenu();
       }
    }
    public static void exitApplication() {
        display("Thank you for using our application");
        System.exit(1);
    }


    private static void EditEntry() {
        try {
            int entry_id = Integer.parseInt(sout("enter entry id"));
            String diaryTitle = sout("enter Entry Title");
            String entryBody = sout("Enter entryBody");
            diary.editEntry(entry_id, diaryTitle, entryBody);
        }
        catch (IndexOutOfBoundsException e){
            display("Entry Not Found");
        }
        mainMenu();
    }


    private static void createEntry() {
        String entryTitle = sout("Enter Entry Title");
        String EntryBody = sout("Enter Entry Body");
        diary.createEntry(entryTitle,EntryBody);
        display("Entry created successfully");
        mainMenu();
    }

    private static void viewEntry() {
        try {
            int diary_Id = Integer.parseInt(sout("Enter entry ID"));
            display(diary.view_entry(diary_Id).toString());
        } catch (IndexOutOfBoundsException e){
            display("Entry Not Found");
        }
        mainMenu();
    }


    private static void deleteEntry() {
        try {
            int entryId = Integer.parseInt(sout("Enter entry ID"));
            diary.deleteEntry(entryId);
        }
        catch (IndexOutOfBoundsException e){
            display("Entry Not Found");
        }
        display("Entry successfully deleted");
        mainMenu();
    }

    private static void getNumberOfEntries(){
        display(String.valueOf(diary.entries.size()));
        mainMenu();
    }

    private static String sout(String prompt){
        return JOptionPane.showInputDialog(prompt);
    }

    private static void display(String prompt){
        JOptionPane.showMessageDialog(null,prompt);
    }

}
