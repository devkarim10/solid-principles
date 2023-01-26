package open_closed_principle;

public class Book {

    String name , authorName , isbn;
    double bookPrice;
    int year;

    public Book(String name, String authorName, String isbn, double bookPrice, int year) {
        this.name = name;
        this.authorName = authorName;
        this.isbn = isbn;
        this.bookPrice = bookPrice;
        this.year = year;
    }
}
