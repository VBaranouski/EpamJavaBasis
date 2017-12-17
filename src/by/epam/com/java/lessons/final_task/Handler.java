package by.epam.com.java.lessons.final_task;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Handler {

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

        NoteFunctions noteFunctions = new NoteFunctions();
        Handler handler = new Handler();
        NotesReaderAndWriter writer = new NotesReaderAndWriter();

        switch (actionNumber) {
        case 1:
            System.out.println("Enter Text note here");
            noteFunctions.addNote(handler.takeStringFromUser());
            break;
        case 2:
            // remove Note
            System.out.println("Enter Text to remove note");
            List<Notes> notes = noteFunctions.removeNote(handler.takeStringFromUser());
            writer.overrideFile(notes);
            break;
        case 3:
            // show notes by date
            System.out.println("Type required date");
            noteFunctions.printFoundNotes(noteFunctions.findNoteByDate(handler.takeStringFromUser()));
            break;
        case 4:
            //show notes by text
            System.out.println("Type required text");
            noteFunctions.printFoundNotes(noteFunctions.findNoteByText(handler.takeStringFromUser()));
            break;
        case 5:
            // show all notes
            noteFunctions.showAllNotes();
            break;
        case 6:
            // delete All notes
            System.out.println("WARNING! Do you want to remove all notes? Type Yes / No");
            deleteDefiner(handler.takeStringFromUser());
            break;
        case 7:
            // exit
            System.out.println("Thank you! Bye bye");
            break;

        default:
            System.out.println("Incorrect number. Please try again");
            break;
        }
    }

    public void deleteDefiner(String answer) throws IOException {
        NoteFunctions noteFunctions = new NoteFunctions();
        switch (answer) {
        case "Yes":
            noteFunctions.removeAllNotes();
            break;
        case "No":
            System.out.println("Cancelled. Thank you! Bye bye");
            break;
        default:
            System.out.println("Incorrect word. Please try again");
            break;
        }
    }


    public int takeNumberFromUser() {
        int number = 0;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("Please type an integer value. Re-run program and try again!");

        }
        return number;

    }


    public String takeStringFromUser() {

        Scanner scanner = new Scanner(System.in);
        String textLine = scanner.nextLine();

        scanner.close();
        return textLine;

    }

}
