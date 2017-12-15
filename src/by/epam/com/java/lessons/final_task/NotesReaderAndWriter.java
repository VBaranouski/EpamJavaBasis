package by.epam.com.java.lessons.final_task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NotesReaderAndWriter {

    private static final String fileName = "src/notes.txt";

    public List<String> readFile() throws IOException {
        List<String> notes = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                notes.add(line);
            }
            reader.close();

        } catch (Exception e) {
            System.err.format("Exception occurred trying to read: ", fileName);
            e.printStackTrace();
            return null;
        }

        return notes;
    }

    public List<Notes> parseNotesFile(List<String> noteFile) {

        List<Notes> notesCollection = new ArrayList<>();

        for (int i = 0; i < noteFile.size(); i++) {
            String[] fields = noteFile.get(i).split(", ");
            Notes note = new Notes();
            note.setTextNote(fields[0]);
            note.setYear(Integer.valueOf(fields[1]));
            notesCollection.add(note);
        }
        return notesCollection;
    }

    public void printNotesFromFile(List<Notes> note) {
        if (!note.isEmpty()) {
            System.out.println("\n" + " Showing all notes: ");
            for (Notes nt : note) {
                System.out.println(nt.getTextNote() + ", " + nt.getYear());

            }
        }else {
            System.out.println("\n" + "Sorry, don't see any notes. Looks like Your Notepad is empty. ");
        }
    }

}

