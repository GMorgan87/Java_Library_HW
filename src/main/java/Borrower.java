import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> books;

    public Borrower() {
        books = new ArrayList<Book>();
    }

    public int getBookCount() {
        return this.books.size();
    }

    public void borrow(Book book, Library library) {
        Book borrowedBook = library.lend(book);
        if (borrowedBook!= null) {
            this.books.add(borrowedBook);
        }
    }
}
