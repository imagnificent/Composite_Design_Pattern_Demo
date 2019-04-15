import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
    	
        long startTime = System.currentTimeMillis();
        System.out.println("Start");
        
        //create two bookshelf with data from xml file
        Bookshelf programmingBookshelf = new Bookshelf("Programming", readData.parseXMLFile(readData.readXMLFile("search_rss.xml")));
        Bookshelf pythonBookshelf = new Bookshelf("Python", readData.parseXMLFile(readData.readXMLFile("python.xml")));

        List <Bookshelf>myBookcaseList = new ArrayList<Bookshelf>();
        
        //create one bookcase and add two bookshelves
        Bookcase myBookcase = new Bookcase("my bookbase", myBookcaseList);
        myBookcase.add(pythonBookshelf);
        myBookcase.add(programmingBookshelf);
        
        //print details of the bookcase
        myBookcase.print();
        
        long endTime = System.currentTimeMillis();
        System.out.println("Run Time: " + (endTime - startTime) + "ms");
    }
}
