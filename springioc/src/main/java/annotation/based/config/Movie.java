package annotation.based.config;

public class Movie {
    private String author;
    private String name;

    public void setAuthor(String author) {
        this.author = author;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Movie [author=" + author + ", name=" + name + "]";
    }
}
