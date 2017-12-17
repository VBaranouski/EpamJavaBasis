package by.epam.com.java.lessons.final_task;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class NotesReaderAndWriter {

    private static final String FILENAME = "src/notes.txt";

    public List<String> readFile() throws IOException {
        List<String> notes = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
            String line;
            while ((line = reader.readLine()) != null) {
                notes.add(line);
            }
            reader.close();

        } catch (Exception e) {
            System.err.format("Exception occurred trying to read: ", FILENAME);
            e.printStackTrace();
            return null;
        }

        return notes;
    }

    public List<Notes> parseNotesFile(List<String> noteFile) {

        List<Notes> notesCollection = new ArrayList<>();
        for (int i = 0; i < noteFile.size(); i++) {
            String[] fields = noteFile.get(i).split(" - ");
            Notes note = new Notes();
            try {
                note.setTime(fields[0]);
                note.setTextNote(fields[1]);
                notesCollection.add(note);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }

        }

        return notesCollection;
    }

    public void printNotesFromFile(List<Notes> note) {
        if (!note.isEmpty()) {
            System.out.println("\n" + "All notes: ");
            for (Notes nt : note) {
                //   System.out.println(nt.getTime() + " - " + nt.getTextNote());
                System.out.println(nt);

            }
        } else {
            System.out.println("\n" + "Sorry, don't see any notes. Looks like Your Notepad is empty. ");
        }
    }

    public void noteWriter(Notes note) throws IOException {
        FileWriter fw = new FileWriter(FILENAME, true);
        BufferedWriter bw = new BufferedWriter(fw);

        note.createDate();
        bw.write(note.getTime() + " - " + note.getTextNote());
        bw.newLine();

        bw.close();
        fw.close();
        System.out.println("Note created!\n");
    }

}

