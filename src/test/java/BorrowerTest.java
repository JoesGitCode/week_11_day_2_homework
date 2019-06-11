import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book;
    private ArrayList<Book> collection;

    @Before
    public void before(){
        borrower = new Borrower("steve");
        library = new Library(5);
    }

    @Test
    public void aBorrowerHasACollectionOfBooks(){
        assertEquals(0, borrower.getCollection());
    }

    @Test
    public void aBorrowerCanBorrowABook(){
        library.addBookToStock(book);
        borrower.borrowABook(library);
        assertEquals(1, borrower.getCollection());
        assertEquals(0, library.getStockCount());
    }
}
