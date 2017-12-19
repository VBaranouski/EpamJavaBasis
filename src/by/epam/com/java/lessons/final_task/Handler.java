package by.epam.com.java.lessons.final_task;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Handler {

    NotepadFunctions notepadFunctions = new NotepadFunctions();
    Handler handler = new Handler();
    NotesFileReaderAndWriter writer = new NotesFileReaderAndWriter();

    public void showGreetingsText() {
        System.out.println("\n" + "Welcome to the NotePad app. Please select an necessary action below: " + "\n"
                + "\n" + "1. Add a new Note "
                + "\n" + "2. Remove existing Note "
                + "\n" + "3. Find Notes by Date "
                + "\n" + "4. Find Notes by Text "
                + "\n" + "5. Show All Notes"
                + "\n" + "6. Delete All Notes "
                + "\n" + "7. Exit "
                + "\n"
        );
    }

    public void defineAction(int actionNumber) throws IOException {

        switch (actionNumber) {
        case 1:
            System.out.println("Enter the text body of Note");
            notepadFunctions.addNote(handler.takeStringFromUser());
            break;
        case 2:
            // remove Note
            System.out.println("Remove notes which contain next text: ");
            List<Notes> notes = notepadFunctions.removeNote(handler.takeStringFromUser());
            writer.overrideFile(notes);
            break;
        case 3:
            // show notes by date
            System.out.println("Enter date in dd.MM.yyyy 'at' hh:mm:ss format");
            notepadFunctions.showFoundNotes(notepadFunctions.findNoteByDate(handler.takeStringFromUser()));
            break;
        case 4:
            //show notes by text
            System.out.println("Type required text");
            notepadFunctions.showFoundNotes(notepadFunctions.findNoteByText(handler.takeStringFromUser()));
            break;
        case 5:
            // show all notes
            notepadFunctions.showAllNotes();
            break;
        case 6:
            // delete All notes
            System.out.println("WARNING! Do you want to remove all notes? Type Yes / No");
            deleteDefiner(handler.takeStringFromUser());
            break;
        case 7:
            // exit
            System.out.println("Thank you! Bye");
            break;

        default:
            System.out.println("Incorrect number or string value. Re-run program and try again!");
            break;
        }
    }

    public void deleteDefiner(String answer) throws IOException {
        switch (answer) {
        case "Yes":
            notepadFunctions.removeAllNotes();
            break;
        case "No":
            System.out.println("Cancelled. Thank you! Bye");
            break;

        default:
            System.out.println("Incorrect word. Please repeat an action.");
            break;
        }
    }

    public int takeNumberFromUser() {
        int number = 0;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        }
        return number;

    }

    public String takeStringFromUser() throws IOException {

        Scanner scanner = new Scanner(System.in);
        String textLine = scanner.nextLine();
        if (textLine.isEmpty()) {
            System.out.println("Text field cannot be empty. Please try again");
            takeStringFromUser();
        }
        scanner.close();
        return textLine;

    }

}
