package by.epam.com.java.lessons.final_task.tests;

import by.epam.com.java.lessons.final_task.NotepadFunctions;
import by.epam.com.java.lessons.final_task.Notes;
import by.epam.com.java.lessons.final_task.NotesFileReaderAndWriter;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

public class TestsForNotepadApp {

    private static Logger log = Logger.getLogger(String.valueOf(TestsForNotepadApp.class));

    NotepadFunctions notepadFunctions = new NotepadFunctions();
    NotesFileReaderAndWriter writer = new NotesFileReaderAndWriter();
    NotesFileReaderAndWriter reader = new NotesFileReaderAndWriter();
    Notes nt = new Notes();

    @Test
    public void createNoteCheck() throws IOException {
        log.info("Creating test note");
        notepadFunctions.addNote("Test");
        List<Notes> noteCollection = reader.parseNotesFile(reader.readFile());
        Assert.assertEquals("Note text doesn't match", noteCollection.get(0).getTextNote(), "Test");
    }

    @Test
    public void findNoteByDateCheck() throws IOException {
        nt.createYear();
        log.info("Looking for Note by correct Date");
        List<Notes> notes = notepadFunctions.findNoteByDate(nt.getTime());
        Assert.assertTrue(notes.get(0).getTime().contains(nt.getTime()));
    }

    @Test
    public void findNoteByDateCheckNegative() throws IOException {
        log.info("Looking for Note by incorrect Date");
        List<Notes> notes = notepadFunctions.findNoteByDate("10.10.1999");
        Assert.assertTrue(notes.isEmpty());
    }

    @Test
    public void findNoteByTextCheckPositive() throws IOException {
        log.info("Looking for Note by required Text");
        List<Notes> notes = notepadFunctions.findNoteByText("Test");
        Assert.assertTrue(notes.get(0).getTextNote().equals("Test"));
    }

    @Test
    public void findNoteByTextCheckNegative() throws IOException {
        log.info("Looking for Note by incorrect Text");
        List<Notes> notes = notepadFunctions.findNoteByText("rbvrhbvrivre ojnojn cedcde");
        Assert.assertTrue(notes.isEmpty());
    }

    @Test @Ignore
    public void removeNoteCheck() throws IOException {
        log.info("Removing note with required Text");
        List<Notes> notes = notepadFunctions.removeNote("Test");
        writer.overrideFile(notes);
        Assert.assertTrue(notes.isEmpty());
    }

    @Test @Ignore
    public void removeAllNotesCheck() throws IOException {
        log.info("Removing all notes");
        notepadFunctions.removeAllNotes();
        List<Notes> notes = reader.parseNotesFile(reader.readFile());
        Assert.assertTrue(notes.isEmpty());
    }
}
