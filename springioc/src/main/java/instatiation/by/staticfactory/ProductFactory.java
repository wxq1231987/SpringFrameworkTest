package instatiation.by.staticfactory;

public class ProductFactory {
    private static Product product = new Product("TÐô", "»ÆÉ«");
    public static Product createProduct() {
        return product;
    }
}
