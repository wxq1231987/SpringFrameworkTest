package genericity.dependency.inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("genericity.dependency.inject.xml");
        /*UserService userService = (UserService) context.getBean("userService");
        userService.save();*/
        RoleService roleService = (RoleService) context.getBean("roleService");
        roleService.save();
    }
}