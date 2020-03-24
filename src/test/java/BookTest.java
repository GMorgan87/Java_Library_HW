import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before() {
        book = new Book("A book", "A writer", "Thriller");
    }

    @Test
    public void hasName(){
        assertEquals("A book", book.getTitle());
    }@Test

    public void hasAuthor(){
        assertEquals("A writer", book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Thriller", book.getGenre());
    }

}
