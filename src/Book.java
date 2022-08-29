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
}
