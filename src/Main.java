public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1984", new Author("George", "Orwell"), 1948);
        System.out.println("Today I read " + book1.getNameAuthor().getFirstName() + " " + book1.getNameAuthor().getLastName() + "'s book " +
                "'" + book1.getNameBook() + "' written in " + book1.getYear());
        book1.setYear(1949);
        System.out.println("In fact, the book was written in " + book1.getYear());
        Book book2 = new Book("20 thousand leagues under the sea", new Author("Jules", "Verne"), 1869);
        System.out.println("Today I read " + book2.getNameAuthor().getFirstName() + " " + book2.getNameAuthor().getLastName() + "'s book " +
                "'" + book2.getNameBook() + "' written in " + book2.getYear());

    }
}