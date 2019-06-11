import java.util.ArrayList;

public class Borrower {

    Library library;
    Book book;
    Borrower borrower;

    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name){
        this.collection = new ArrayList<Book>();
    }

    public int getCollection(){
       return this.collection.size();
    }


    public void borrowABook(Library library){
        if (library.getStockCount() > 0){
            Book book = library.removeBook();
            this.collection.add(book);
        }

    }



}
