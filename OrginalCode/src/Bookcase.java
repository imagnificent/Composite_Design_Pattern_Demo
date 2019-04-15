import java.util.ArrayList;
import java.util.List;

public class Bookcase{

    private String name;
    private List <Bookshelf> BookshelfList = new ArrayList<Bookshelf>();

    public Bookcase(String name, List<Bookshelf> Bookshelf) {
        this.name = name;
        this.BookshelfList = Bookshelf;
    }
    public String getName() {
        return this.name;
    }

    public void add(Bookshelf bookshelf) {
        this.BookshelfList.add(bookshelf);
    }

    public void remove(Bookshelf bookshelf) {
        this.BookshelfList.remove(bookshelf);
    }

    public void print() {
        System.out.println(this.getName());
        for (Bookshelf bookshelf : this.BookshelfList) {
            bookshelf.print();
        }
    }
    
    public List<Bookshelf> getChildren() {
    	return this.BookshelfList;
    }

}
