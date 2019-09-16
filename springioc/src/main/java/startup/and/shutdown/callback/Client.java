package startup.and.shutdown.callback;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ¿Í»§Àà
 * @author Tina
 *
 */
public class Client {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lifecycle-callback.xml");
    }

}