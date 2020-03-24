import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book1;
    private Book book2;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(2);
        book1 = new Book("A book", "A writer", "Thriller");
        book2 = new Book("Another book", "Another writer", "non-fiction");
    }

    @Test
    public void canGetBookCount(){
        assertEquals(0, borrower.getBookCount());
    }

    @Test
    public void canBorrowBookInStock(){
        library.addBook(book1);
        borrower.borrow(book1, library);
        assertEquals(1, borrower.getBookCount());
        assertEquals(0, library.getBookCount());
    }
    @Test
    public void cantBorrowBookNotInStock(){
        library.addBook(book1);
        borrower.borrow(book2, library);
        assertEquals(0, borrower.getBookCount());
        assertEquals(1, library.getBookCount());
    }
}
