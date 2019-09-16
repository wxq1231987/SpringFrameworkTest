package annotation.based.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Person {
    private String name;
    private int age;
    private Dog dog;
    @Required
    public void setName(String name) {
        this.name = name;
    }
    @Required
    public void setAge(int age) {
        this.age = age;
    }
    @Autowired
    public void setDog(Dog dog) {
        this.dog = dog;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", dog=" + dog.toString() + "]";
    }

}