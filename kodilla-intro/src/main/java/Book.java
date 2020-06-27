public class Book {

    private String author;
    private String title;

    private Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public String toString() {
        return this.author + " - " + this.title;
    }

    public static void main(String[] args) {
        Book book = Book.of("Henryk Sienkiewicz", "Ogniem i mieczem");
        System.out.println(book);
    }

    private static Book of(String author, String title) {
        return new Book(author, title);
    }

}
