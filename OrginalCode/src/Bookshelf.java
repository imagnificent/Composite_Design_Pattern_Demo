import java.util.ArrayList;
import java.util.List;

public class Bookshelf{

    private String name;
    private List <Book> BookList = new ArrayList<Book>();

    public Bookshelf(String name, List<Book> Books) {
        this.name = name;
        this.BookList = Books;
    }
    public String getName() {
        return this.name;
    }

    public void add(Book Book) {
        this.BookList.add(Book);
    }

    public void remove(Book Book) {
        this.BookList.remove(Book);
    }

    public void print() {
        System.out.println(this.getName());
        for (Book Book : this.BookList) {
            Book.print();
        }
    }
    
    public List<Book> getChildren() {
    	return this.BookList;
    }

}
