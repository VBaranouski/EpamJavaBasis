package by.epam.com.java.lessons.six_and_seven;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookReader {

    private static final String fileName = "src/books.txt";

    public List<String> readFile() throws IOException {

        List<String> books = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                books.add(line);
            }
            reader.close();

        } catch (Exception e) {
            System.err.format("Exception occurred trying to read: ", fileName);
            e.printStackTrace();
            return null;
        }

        return books;
    }

    public List<Book> parseBookFile(List<String> booksFile) {

        List<Book> booksCollection = new ArrayList<>();

        for (int i = 0; i < booksFile.size(); i++) {

            String[] fields = booksFile.get(i).split(", ");
            Book book = new Book();
            book.setTitle(fields[0]);
            book.setAuthor(fields[1]);
            book.setYear(Integer.parseInt(fields[2]));
            booksCollection.add(book);
        }

        return booksCollection;

    }

    public void printBooksFromFile(List<Book> books) {
        System.out.println("\n" + "Reading from file: ");
        for (Book bk : books) {
            System.out.println(bk.getTitle() + ", " + bk.getAuthor() + ", " + bk.getYear());

        }


    }

    public void readAndPrint(BookReader br) throws IOException {
        List<String> booksFile = br.readFile();  // read books from books.txt file
        List<Book> bookCollection = br.parseBookFile(booksFile);   // parse txt file, and create the collection
        br.printBooksFromFile(bookCollection);  // show collection
    }

}
