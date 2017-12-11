package by.epam.com.java.lessons.six;

import java.util.ArrayList;
import java.util.List;

public class LibraryActions {

    public List<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }

    public void remove(String title) {
        for (Book bk : books) {
            if (bk.getTitle().equals(title)) {
                books.remove(bk);
            }
        }
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                System.out.println("\n" + "Found book: ");
                printBook(book);
                return book;
            }
        }
        return null;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void printAllBooks(LibraryActions book) {
        System.out.println("\n" + "Library collection: ");
        List<Book> showBooks = book.getBooks();
        for (Book bk : showBooks) {
            printBook(bk);
        }
    }

    public void printBook(Book bk) {
        System.out.println(bk.getTitle() + ", " + bk.getAuthor() + ", " + bk.getYear());
    }

}
