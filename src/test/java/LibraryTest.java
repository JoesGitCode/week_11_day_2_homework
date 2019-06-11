import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Book book;
    Library library;

    @Before
    public void before(){
        library = new Library(3);
    }

    @Test
    public void getStockCount(){
        assertEquals(0, library.getStockCount());
    }

    @Test
    public void aLibraryCanAddABook(){
        this.library.addBookToStock(book);
        assertEquals(1, library.getStockCount());
    }

    @Test
    public void aLibraryCannotExceedItsCapacity(){
        this.library.addBookToStock(book);
        this.library.addBookToStock(book);
        this.library.addBookToStock(book);
        this.library.addBookToStock(book);
        assertEquals(3, library.getStockCount());
    }

    @Test
    public void canRemoveABook(){
        this.library.addBookToStock(book);
        this.library.removeBook();
        assertEquals(0, library.getStockCount());
    }


}
