package annotation.based.config;

public class Dog {
    private String type;

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Dog [type=" + type + "]";
    }

}
