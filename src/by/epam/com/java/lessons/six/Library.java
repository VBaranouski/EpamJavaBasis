package by.epam.com.java.lessons.six;

import java.io.IOException;
import java.util.List;

public class Library {

    public static void main(String[] args) throws IOException {

        LibraryActions book = new LibraryActions();
        book.add(new Book("The Shining", "Stephen King", 1977));
        book.add(new Book("It", "Stephen King", 1987));
        book.add(new Book("The Dark Tower VII", "Stephen King", 2005));
        book.printAllBooks(book);   //show all books

        Book foundBook = book.findBookByTitle("It");   //find book by title
        if (foundBook == null) {
            System.out.println("\n" + "No such book found");
        }

        book.remove("It");  // remove book by title
        book.printAllBooks(book);

        BookReader br = new BookReader();
        List<String> booksFile = br.readFile();  // read books from books.txt file
        List<Book> bookCollection = br.parseBookFile(booksFile);   // parse txt file, and create the collection
        br.printBooksFromFile(bookCollection);  // show collection
    }
}
