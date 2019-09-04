package lifecycle.callback;

import org.springframework.beans.factory.DisposableBean;

public class ExampleBean4 implements DisposableBean {
    private static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

    public void destroy() throws Exception {
        System.out.println("ExampleBean4 will destroy");
    }
}
