public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1984", new Author("George", "Orwell"), 1948);
        System.out.println(book1);
        book1.setYear(1949);
        System.out.println("In fact, the book was written in " + book1.getYear());
        Book book2 = new Book("20 thousand leagues under the sea", new Author("Jules", "Verne"), 1869);
        System.out.println(book2);
    }
}