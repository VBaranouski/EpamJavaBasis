package by.epam.com.java.lessons.final_task;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NoteFunctions {

    NotesReaderAndWriter reader = new NotesReaderAndWriter();

    public void showAllNotes() throws IOException {
        List<Notes> noteCollection = reader.parseNotesFile(reader.readFile());
        reader.printNotesFromFile(noteCollection);
    }

    public List<Notes> findNoteByText(String text) throws IOException {
        List<Notes> noteCollection = reader.parseNotesFile(reader.readFile());
        List<Notes> foundNotes = new ArrayList<>();
        for (Notes note : noteCollection) {
            if (note.getTextNote().contains(text)) {
                foundNotes.add(note);
            }
        }
        return foundNotes;
    }

    public List<Notes> findNoteByDate(String date) throws IOException {
        List<Notes> noteCollection = reader.parseNotesFile(reader.readFile());
        List<Notes> foundNotes = new ArrayList<>();
        for (Notes note : noteCollection) {
            if (note.getTime().contains(date)) {
                foundNotes.add(note);
            }
        }
        return foundNotes;
    }

    public void printNotes(List<Notes> foundNotes) {
        if (!foundNotes.isEmpty()) {
            System.out.println("\n" + "Found notes: ");
            for (Notes note : foundNotes) {
                System.out.println(note);
            }
        } else {
            System.out.println("\n" + "No such notes found");
        }

    }

    public void addNote(String text) throws IOException {
        Notes note = new Notes(text);
        reader.noteWriter(note);

    }
}
