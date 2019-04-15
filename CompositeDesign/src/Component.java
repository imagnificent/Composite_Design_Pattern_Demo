
import java.util.List;

public interface Component {
	
	public String getName();
	
    public void add(Component component);

    public void remove(Component component);

    public void print();

    public String getContent();
    
    public List<Component> getChildren();
}
