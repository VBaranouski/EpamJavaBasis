package by.epam.com.java.lessons.six_and_seven;

import java.io.IOException;
import java.util.List;

public class Library {

    public static void main(String[] args) throws IOException {

        Book foundBook;
        LibraryActions book = new LibraryActions();
        book.add(new Book("The Shining", "Stephen King", 1977, 25.3));
        book.add(new Book("It", "Stephen King", 1987, 13.99));
        book.add(new Book("The Dark Tower VII", "Stephen King", 2005, 17.3));

        foundBook = book.findBookByTitle("It");   //find book by title
        if (foundBook == null) {
            System.out.println("\n" + "No such book found");
        }
        book.printBook(foundBook);

        List<Book> foundBooks = book.findBookByAuthor("Stephen Kingsss");
        if (foundBooks != null) {
            book.printBook(foundBooks);

        }
        System.out.println("\n" + "No such book found");


        BookReader reader = new BookReader();
        reader.readAndPrint(reader);
    }
}
