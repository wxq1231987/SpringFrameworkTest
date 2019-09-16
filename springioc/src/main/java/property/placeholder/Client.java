package property.placeholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ¿Í»§Àà
 * @author Tina
 *
 */
public class Client {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("property-placeholder.xml");
        DataSource dataSource = (DataSource) context.getBean("dataSource");
        dataSource.toString();
        System.out.println(dataSource.toString());
    }

}
