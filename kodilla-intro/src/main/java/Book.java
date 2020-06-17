public class Book {

    private String author(){
        String author = "Adam Mickiewicz";
        return author;
    }

    private String title(){
        String title = "Pan Tadeusz";
        return title;
    }

    public static void main(String[] args) {
        Book book = Book.of("Adam Mickiewicz", "TPan Tadeusz");
        System.out.println(book);
    }

    private static Book of(String adam_mickiewicz, String tPan_tadeusz) {
        String author = null;
        String title;
        return (null);
    }

}
