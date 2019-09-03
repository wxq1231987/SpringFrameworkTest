package dependency.inject.excludeautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("exclude-bean-autowiring.xml");
        Chinese chinese = (Chinese) context.getBean("chinese");
        chinese.greet();
    }

}
