package by.epam.com.java.lessons.final_task;

import java.io.IOException;

public class Notepad {

    public static void main(String[] args) throws IOException {

        Handler handler = new Handler();
        handler.showGreetingsText();
        handler.defineAction(handler.takeNumberFromUser());

    }
}
