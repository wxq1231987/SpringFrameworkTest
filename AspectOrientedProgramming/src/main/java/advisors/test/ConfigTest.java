package advisors.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wangxuqin.common.test.Student;

public class ConfigTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/config/common-beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }
}