package by.epam.com.java.lessons.final_task;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NotepadFunctions {

    NotesFileReaderAndWriter reader = new NotesFileReaderAndWriter();

    public void showAllNotes() throws IOException {
        List<Notes> noteCollection = reader.parseNotesFile(reader.readFile());
        reader.printNotesFromFile(noteCollection);
    }

    public void showFoundNotes(List<Notes> foundNotes) {
        if (!foundNotes.isEmpty()) {
            System.out.println("\n" + "Found notes: ");
            for (Notes note : foundNotes) {
                System.out.println(note);
            }
        } else {
            System.out.println("\n" + "No notes with such date or text were found.");
        }
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

    public List<Notes> removeNote(String text) throws IOException {
        int i = 0;

        List<Notes> noteCollection = reader.parseNotesFile(reader.readFile());
        for (Iterator<Notes> iterator = noteCollection.iterator(); iterator.hasNext(); ) {
            Notes value = iterator.next();
            if (value.getTextNote().contains(text) && text != null) {
                i++;
                iterator.remove();
            }
        }
        if (i > 0) {
            System.out.println("Note has been removed!\n");
        } else {
            System.out.println("Notes are not found.\n");
        }

        return noteCollection;
    }

    public void removeAllNotes() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(NotepadConstants.FILENAME));
        bw.write(" ");
        bw.newLine();
        bw.close();
        System.out.println("All Notes Have been removed");

    }

    public void addNote(String text) throws IOException {
        Notes note = new Notes(text);
        reader.writerNotesToFile(note);

    }
}
