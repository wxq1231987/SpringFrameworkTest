package lifecycle.callback;

public class ExampleBean3 {
    private static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    public void destroy() {
        array = null;
        System.out.println("ExampleBean3 will destroy");
    }
}
