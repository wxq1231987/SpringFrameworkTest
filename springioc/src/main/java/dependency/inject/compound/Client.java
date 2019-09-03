package dependency.inject.compound;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class Client {

    public static void main(String[] args) {
        /*ApplicationContext context = new ClassPathXmlApplicationContext("setter-bean.xml");
        ExampleBean exampleBean = (ExampleBean) context.getBean("exampleBean");
        System.out.println(exampleBean.hashCode());*/
        /*ApplicationContext context2 = new ClassPathXmlApplicationContext("setter-bean.xml");
        ExampleBean exampleBean2 = (ExampleBean) context2.getBean("exampleBean2");
        System.out.println(exampleBean2.hashCode());*/
        ApplicationContext context2 = new ClassPathXmlApplicationContext("setter-bean.xml");
        ExampleBean exampleBean3 = (ExampleBean) context2.getBean("exampleBean3");
        System.out.println(exampleBean3.hashCode());

    }

}