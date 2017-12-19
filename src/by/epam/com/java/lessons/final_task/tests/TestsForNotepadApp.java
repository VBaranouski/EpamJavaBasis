package by.epam.com.java.lessons.final_task.tests;

import by.epam.com.java.lessons.final_task.NotepadFunctions;
import by.epam.com.java.lessons.final_task.Notes;
import by.epam.com.java.lessons.final_task.NotesFileReaderAndWriter;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class TestsForNotepadApp {

    NotepadFunctions notepadFunctions = new NotepadFunctions();
    NotesFileReaderAndWriter writer = new NotesFileReaderAndWriter();
    NotesFileReaderAndWriter reader = new NotesFileReaderAndWriter();
    Notes nt = new Notes();

    @Test
    public void createNoteCheck() throws IOException {
        notepadFunctions.addNote("Test");
        List<Notes> noteCollection = reader.parseNotesFile(reader.readFile());
        Assert.assertEquals("Note text doesn't match", noteCollection.get(0).getTextNote(), "Test");
    }

    @Test
    public void findNoteByDateCheck() throws IOException {
        nt.createYear();
        List<Notes> notes = notepadFunctions.findNoteByDate(nt.getTime());
        Assert.assertTrue(notes.get(0).getTime().contains(nt.getTime()));
    }

    @Test
    public void findNoteByDateCheckNegative() throws IOException {
        List<Notes> notes = notepadFunctions.findNoteByDate("10.10.1999");
        Assert.assertTrue(notes.isEmpty());
    }

    @Test
    public void findNoteByTextCheckPositive() throws IOException {
        List<Notes> notes = notepadFunctions.findNoteByText("Test");
        Assert.assertTrue(notes.get(0).getTextNote().equals("Test"));
    }

    @Test
    public void findNoteByTextCheckNegative() throws IOException {
        List<Notes> notes = notepadFunctions.findNoteByText("rbvrhbvrivre ojnojn cedcde");
        Assert.assertTrue(notes.isEmpty());
    }

    @Test @Ignore
    public void removeNoteCheck() throws IOException {
        List<Notes> notes = notepadFunctions.removeNote("Test");
        writer.overrideFile(notes);
        Assert.assertTrue(notes.isEmpty());
    }

    @Test @Ignore
    public void removeAllNotesCheck() throws IOException {
        notepadFunctions.removeAllNotes();
        List<Notes> notes = reader.parseNotesFile(reader.readFile());
        Assert.assertTrue(notes.isEmpty());
    }
}
