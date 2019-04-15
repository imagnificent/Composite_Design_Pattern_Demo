import java.util.ArrayList;
import java.util.List;

public class Book {

    private String name;
    private List<Information> InformationList = new ArrayList<Information>();

    public Book (String name, List<Information> InformationList) {
        this.name = name;
        this.InformationList = InformationList;
    }

    public String getName() {
        return this.name;
    }

    public void add(Information Information) {
        this.InformationList.add(Information);
    }

    public void remove(Information Information) {
        this.InformationList.remove(Information);
    }


    public void print() {
        System.out.println(this.getName());
        for (Information Information : this.InformationList) {
            Information.print();
        }
    }
    
    public List<Information> getChildren(){
    	return this.InformationList;
    }
}

