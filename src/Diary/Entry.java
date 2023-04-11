package Diary;

import java.time.LocalDateTime;

public class Entry {
    private String title;
    private String body;
    private final LocalDateTime date = LocalDateTime.now();
    private int id;

    public Entry(String diaryTitle, String entryBody, int id){
        this.title = diaryTitle;
        this.body = entryBody;
        this.id = id;
    }

    public void setEntryTitle(String entryName) {
        this.title = entryName;
    }
    public String getEntryTitle(){
        return title;
    }
    public void setEntryBody(String entryBody) {
        this.body = entryBody;
    }

    public String getEntryBody(){
        return body;
    }

    public void setEntryId(int id) {
        this.id = id;
    }
    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return String.format("""
                ===========================
                EntryTitle: %s
                EntryBody: %s
                EntryId: %s
                ===========================
                """, title, body, id);
    }
}