import java.util.List;

public class Information implements Component {
    private String name;
    private String content;

    public Information (String name, String content) {
        this.name = name;
        this.content = content;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.getContent());
    }

    @Override
    public String getContent() {
        return this.content;
    }

	@Override
	public void add(Component component) {
		throw new UnsupportedOperationException("Unsupported Operation");
		
	}

	@Override
	public void remove(Component component) {
		throw new UnsupportedOperationException("Unsupported Operation");
		
	}

	@Override
	public List<Component> getChildren() {
		throw new UnsupportedOperationException("Unsupported Operation");
	}
}
