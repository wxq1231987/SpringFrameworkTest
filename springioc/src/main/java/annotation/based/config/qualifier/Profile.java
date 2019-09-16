package annotation.based.config.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
    @Autowired
    @Qualifier("student")
    private Student student;
    public void printName() {
        System.out.println(student.getName());
    }
    public void printAge() {
        System.out.println(student.getAge());
    }
}
