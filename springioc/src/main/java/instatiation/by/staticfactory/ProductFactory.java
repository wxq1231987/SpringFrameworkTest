package instatiation.by.staticfactory;

public class ProductFactory {
    private static Product product = new Product("T��", "��ɫ");
    public static Product createProduct() {
        return product;
    }
}
