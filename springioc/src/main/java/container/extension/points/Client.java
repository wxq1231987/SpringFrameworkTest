package container.extension.points;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * �ͻ���
 * @author Tina
 *
 */
public class Client {

    public static void main(String[] args) {
        ApplicationContext context2 = new ClassPathXmlApplicationContext("bean-post-processor.xml");
        ExampleBean exampleBean = (ExampleBean) context2.getBean("exampleBean");
        System.out.println(exampleBean.hashCode());

    }

}
