package aspect.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Dancer dancer = (Dancer) ctx.getBean("dancer");
        Account account = new Account("杨丽萍", "孔雀舞");
        Track track = new Track("杨丽萍", "孔雀公主", null);
        dancer.performance();
        dancer.setTrack(track);
        dancer.getTrack();
        //dancer.introduce();
        //dancer.introduce(account);
        dancer.showGratitude(track, account);
    }
}