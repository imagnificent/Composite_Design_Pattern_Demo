import java.util.ArrayList;
import java.util.List;

public class BookCollection implements Component {

	private String name;
	private List<Component> children = new ArrayList<>();

    public BookCollection (String name, List<Component> informationList) {
        this.name = name;
        this.children = informationList;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void add(Component component) {
        this.children.add(component);
    }

    @Override
    public void remove(Component component) {
        this.children.remove(component);
    }

    @Override
    public void print() {
        System.out.println(this.getName());
        for (Component component : this.children) {
            component.print();
        }
    }

	@Override
	public String getContent() {
		throw new UnsupportedOperationException("Unsupported Operation");
	}

	@Override
	public List<Component> getChildren() {
		return this.children;
	}
}
