package resource.dependency.inject;

public class MovieFinder {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MovieFinder [name=" + name + "]";
    }
    
}
