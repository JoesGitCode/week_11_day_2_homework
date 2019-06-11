import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
       book = new Book("Lorraine: Between You and Me", "Lorraine Kelly", "Autobiography");
    }

    @Test
    public void aBookHasA_Title(){
        assertEquals("Lorraine: Between You and Me", book.getTitle());
    }

    @Test
    public void aBookHasA_Author(){
        assertEquals("Lorraine Kelly", book.getAuthor());
    }

    @Test
    public void aBookHasA_Genre(){
        assertEquals("Autobiography", book.getGenre());
    }
}
