package resource.dependency.inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resource.xml");
        SimpleMovieLister simpleMovieLister = (SimpleMovieLister) context.getBean("simpleMovieLister");
        simpleMovieLister.print();
    }
}