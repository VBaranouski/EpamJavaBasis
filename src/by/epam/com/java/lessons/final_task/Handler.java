package by.epam.com.java.lessons.final_task;

import java.io.IOException;
import java.util.Scanner;

public class Handler {

    public void showGreetingsText() {
        System.out.println("\n" + "Welcome to the NotePad app. Please select an necessary action below: " + "\n"
                + "\n" + "1. Add a new Note "
                + "\n" + "2. Remove existing Note "
                + "\n" + "3. Find Notes by Date "
                + "\n" + "4. Find Notes by Text "
                + "\n" + "5. Show All Notes"
                + "\n" + "6. Exit "
                + "\n"
        );
    }

    public void defineAction(int actionNumber) throws IOException {

        NoteFunctions noteFunctions = new NoteFunctions();
        Handler handler = new Handler();

        switch (actionNumber) {
        case 1:
            System.out.println("Enter Text note here");
            noteFunctions.addNote(handler.takeStringFromUser());
            break;
        case 2:
            // remove Note
            break;
        case 3:
            // show notes by date
            System.out.println("Type required date");
            noteFunctions.printNotes(noteFunctions.findNoteByDate(handler.takeStringFromUser()));
            break;
        case 4:
            //show notes by text
            System.out.println("Type required text");
            noteFunctions.printNotes(noteFunctions.findNoteByText(handler.takeStringFromUser()));
            break;
        case 5:
            // show all notes
            noteFunctions.showAllNotes();
            break;
        case 6:
            // exit
            System.out.println("Thank you! Bye bye");
            break;

        default:
            System.out.println("Incorrect number. Please try again");
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

    public String takeStringFromUser(){

        Scanner scanner = new Scanner(System.in);
        String textLine = scanner.nextLine();

        scanner.close();
        return textLine;


    }

}
