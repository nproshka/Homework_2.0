public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1984", new Author("George", "Orwell"), 1948);
        book1.setYear(1949);
        Book book2 = new Book("20 thousand leagues under the sea", new Author("Jules", "Verne"), 1869);
    }
}