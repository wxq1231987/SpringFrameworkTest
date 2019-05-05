package aspect.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Dancer dancer = (Dancer) ctx.getBean("dancer");
        dancer.performance();
        dancer.getTrack();
    }
}