package aspect.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.refresh();
        Performance dancer = ctx.getBean("dancer", Dancer.class);
        dancer.performance();
    }
}