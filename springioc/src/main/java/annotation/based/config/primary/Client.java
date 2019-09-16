package annotation.based.config.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("primary.xml");
        MovieRecommender movieRecommender = (MovieRecommender) context.getBean("movieRecommender");
        MovieCatalog firstMovieCatalog = (FirstMovieCatalog) context.getBean("firstMovieCatalog");
        System.out.println(firstMovieCatalog.hashCode());
        System.out.println(movieRecommender.toString());
    }
}