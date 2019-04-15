public class Information {
    private String name;
    private String content;

    public Information (String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return this.name;
    }

    public void print() {
        System.out.println(this.getContent());
    }

    public String getContent() {
        return this.content;
    }
}

