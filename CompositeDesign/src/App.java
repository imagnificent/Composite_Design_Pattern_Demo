import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
    	
        long startTime = System.currentTimeMillis();
        System.out.println("Start");
        
        //create two bookshelf with data from xml file
        BookCollection programmingBookshelf = new BookCollection("Programming", readData.parseXMLFile(readData.readXMLFile("search_rss.xml")));
        BookCollection pythonBookshelf = new BookCollection("Python", readData.parseXMLFile(readData.readXMLFile("python.xml")));
        
        List <Component>myBookcaseList = new ArrayList<Component>();
        
        //create one bookcase and add two bookshelves
        BookCollection myBookcase = new BookCollection("my bookbase", myBookcaseList);
        myBookcase.add(pythonBookshelf);
        myBookcase.add(programmingBookshelf);
        
        //print details of the bookcase
        myBookcase.print();
        
        long endTime = System.currentTimeMillis();
        System.out.println("Run Time: "+(endTime-startTime)+"ms");
    }
}
