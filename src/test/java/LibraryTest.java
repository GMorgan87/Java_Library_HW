import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        library = new Library(2);
        book1 = new Book("A book", "A writer", "Thriller");
        book2 = new Book("Another book", "A different writer", "Non-Fiction");
        book3 = new Book("Yet Another book", "Another writer", "comedy");
    }

    @Test
    public void canGetNumberOfBooks(){
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBooks() {
        library.addBook(book1);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void cantAddMoreBooksThanCapacity() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.getBookCount());
    }



}
