package Diary;

import java.util.ArrayList;

public class Diary {


    private boolean isLocked;

    ArrayList<Entry> entries = new ArrayList<>();


    public void createEntry(String diaryTitle, String entryBody) {
        int entryId = entries.size() + 1;
        Entry entry = new Entry(diaryTitle, entryBody, entryId);
        entries.add(entry);
    }



    public boolean isLocked() {
        return isLocked;
    }

    public void lockDiary(){
        this.isLocked = true;
    }

    public int getNumberOfEntries() {
        return entries.size();
    }

    public Entry view_entry(int entry_Id) {
        return entries.get(entry_Id - 1);

    }

    public void deleteEntry(int entry_Id) {
        entries.remove(entry_Id - 1);
    }

    public void editEntry(int entry_id, String diaryTitle, String entryBody) {
        deleteEntry(entry_id);
        createEntry(diaryTitle,entryBody);
    }

}
