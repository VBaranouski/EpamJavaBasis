package by.epam.com.java.lessons.final_task;

import java.io.IOException;
import java.util.List;

public class NoteFunctions {

    public void showAllNotes() throws IOException {
        NotesReaderAndWriter reader = new NotesReaderAndWriter();
        List<String> noteString = reader.readFile();
        List<Notes> noteCollection = reader.parseNotesFile(noteString);
        reader.printNotesFromFile(noteCollection);
    }


    public List<Notes> findNoteByText(String text) throws IOException {
        NotesReaderAndWriter reader = new NotesReaderAndWriter();
        List<String> noteString = reader.readFile();
        List<Notes> noteCollection = reader.parseNotesFile(noteString);
        for (Notes note: noteCollection) {
            if (note.getTextNote().contains(text)) {
                return noteCollection;
            }
        }
        return null;
    }


    public void printNotes(List<Notes> foundNotes) {
        if (foundNotes != null) {
            System.out.println("\n" + "Found notes: ");
            for (Notes note : foundNotes) {
                System.out.println(note.getTextNote() + ", " + note.getYear());
            }
        } else {
            System.out.println("\n" + "No such notes found");
        }

    }
}
