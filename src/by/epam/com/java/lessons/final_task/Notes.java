package by.epam.com.java.lessons.final_task;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Notes {

    private String textNote;

    public String getTextNote() {
        return textNote;
    }

    public void setTextNote(String textNote) {
        this.textNote = textNote;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    private String time;

    public Notes(String textNote) {
        this.textNote = textNote;
    }

    public Notes() {
    }

    public void createDate() {
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy 'at' hh:mm:ss a ");
        setTime(ft.format(date).toString());

    }

    @Override public String toString() {
        return time + " - " + textNote;
    }
}

