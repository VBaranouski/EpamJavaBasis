package by.epam.com.java.lessons.six_and_seven;

import java.io.IOException;
import java.util.List;

public class Library {

    public static void main(String[] args) throws IOException {

        LibraryActions book = new LibraryActions();
        book.add(new Book("The Shining", "Stephen King", 1977, 25.3));
        book.add(new Book("It", "Stephen King", 1987, 13.99));
        book.add(new Book("The Dark Tower VII", "Stephen King", 2005, 17.3));
        book.printAllBooks(book);

        Book foundBook = book.findBookByTitle("It");   //find book by title
        book.printBook(foundBook);

        List<Book> foundBooks = book.findBookByAuthor("Stephen King");
        book.printBook(foundBooks, true);

        BookReader reader = new BookReader();
        reader.readAndPrint(reader);
    }
}
