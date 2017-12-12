package by.epam.com.java.lessons.six_and_seven;

public class Book {

    private String title;
    private String author;
    private int year;
    private double price;

    public Book(String title, String author, int year, double price) {

        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    public Book() { }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }


    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Book))
            return false;

        Book book = (Book) o;

        if (getYear() != book.getYear())
            return false;
        if (Double.compare(book.getPrice(), getPrice()) != 0)
            return false;
        if (getTitle() != null ? !getTitle().equals(book.getTitle()) : book.getTitle() != null)
            return false;
        return getAuthor() != null ? getAuthor().equals(book.getAuthor()) : book.getAuthor() == null;
    }

    @Override public int hashCode() {
        int result;
        long temp;
        result = getTitle() != null ? getTitle().hashCode() : 0;
        result = 31 * result + (getAuthor() != null ? getAuthor().hashCode() : 0);
        result = 31 * result + getYear();
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
