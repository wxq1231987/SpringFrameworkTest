package dependency.inject.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructor-arg.xml");
        Foo foo = (Foo) context.getBean("foo");
        System.out.println(foo.hashCode());
        ExampleBean exampleBean1 = (ExampleBean) context.getBean("exampleBean1");
        System.out.println(exampleBean1.toString());
        ExampleBean exampleBean2 = (ExampleBean) context.getBean("exampleBean2");
        System.out.println(exampleBean2.toString());
        ExampleBean exampleBean3 = (ExampleBean) context.getBean("exampleBean3");
        System.out.println(exampleBean3.toString());
    }
}