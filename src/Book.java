import java.util.Objects;

public class Book {

    private final String nameBook;
    private final Author nameAuthor;
    private int year;

    public Book(String name, Author author, int year) {
        this.nameBook = name;
        this.nameAuthor = author;
        this.year = year;
    }

    public String getNameBook() {
        return this.nameBook;
    }
    public Author getNameAuthor() {
        return this.nameAuthor;
    }
    public int getYear() {
        return this.year;
    }

    public void setYear(int year1) {
        this.year = year1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(nameBook, book.nameBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook);
    }

    @Override
    public String toString() {
        return "Today I read " + nameAuthor + "'" + nameBook + "'" + " written in " + year + ".";
    }
}
