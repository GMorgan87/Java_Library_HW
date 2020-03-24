import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int getBookCount(){
        return this.books.size();
    }

    public void addBook(Book book) {
        if (this.getBookCount() < this.capacity) {
            this.books.add(book);
        }
    }

    public Book lend(Book book) {
        if (this.books.contains(book)){
            books.remove(book);
            return book;
        }
        return null;
    }
}


