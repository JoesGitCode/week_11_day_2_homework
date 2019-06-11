import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> stock;

    public Library(int capacity){
        this.stock = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int getStockCount(){
        return this.stock.size();
    }

    public void addBookToStock(Book book){
        if (this.capacity > this.getStockCount()){
            this.stock.add(book);
        }
    }

}
