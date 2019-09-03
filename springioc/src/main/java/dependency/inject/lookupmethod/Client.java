package dependency.inject.lookupmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("lookup-method.xml");
        PizzaShop shop = (PizzaShop) context.getBean("pizzaShop");
        Pizza pizza = shop.makePizza();
        Pizza veggiePizza = shop.makeVeggiePizza();
        System.out.println(pizza.toString());
        System.out.println(veggiePizza.toString());
    }
}
