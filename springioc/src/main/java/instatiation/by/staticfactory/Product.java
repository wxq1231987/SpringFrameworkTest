package instatiation.by.staticfactory;

public class Product {
    private String name;
    private String color;

    public Product(String name, String color) {
        super();
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", color=" + color + "]";
    }
}