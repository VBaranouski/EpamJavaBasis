package by.epam.com.java.lessons.six_and_seven;

import java.util.ArrayList;
import java.util.List;

public class LibraryActions {

    public List<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }


    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public List<Book> findBookByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                return books;
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

    public void printBook(Book book) {
        System.out.println("\n" + "Found book: ");
        System.out.println(book.getTitle() + ", " + book.getAuthor() + ", " + book.getYear());

    }

    public void printBook(List<Book> foundBooks) {
        System.out.println("\n" + "Found books: ");
        for (Book bk : foundBooks) {
            System.out.println(bk.getTitle() + ", " + bk.getAuthor() + ", " + bk.getYear());
        }

    }

}
