package by.epam.com.java.lessons.Six;

public class Library {

    public static void main(String[] args) {

        LibraryActions book = new LibraryActions();
        book.add(new Book("The Shining", "Stephen King", 1977));
        book.add(new Book("It", "Stephen King", 1987));
        book.add(new Book("The Dark Tower VII", "Stephen King", 2005));

        book.print(book);   //show books

        book.findBookByTitle("It");   //find book by title
    }
}
