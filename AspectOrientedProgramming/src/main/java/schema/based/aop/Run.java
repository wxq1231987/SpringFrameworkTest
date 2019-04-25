package schema.based.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("introductions.xml");
        StudentAdditional studentAdditional = (StudentAdditional) context.getBean("studentAdditional");
        ((Student) studentAdditional).showDetails();
        studentAdditional.showAdditionalDetails();
    }

}