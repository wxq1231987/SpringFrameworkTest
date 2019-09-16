package annotation.based.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ¿Í»§Àà
 * @author Tina
 *
 */
public class Client {

    public static void main(String[] args) {
        /*ApplicationContext context = new ClassPathXmlApplicationContext("annotation-based.xml");
        //SimpleMovieListener listener = (SimpleMovieListener) context.getBean("simpleMovieListener");
        Person person = (Person) context.getBean("person");
        System.out.println(person.toString());*/
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation-based.xml");
        /*MovieRecommender movieRecommender = (MovieRecommender) context.getBean("movieRecommender");
        movieRecommender.execute();*/
        MovieRecommender2 movieRecommender = (MovieRecommender2) context.getBean("movieRecommender2");
        movieRecommender.printHashCode();
        MovieRecommender3 movieRecommender3 = (MovieRecommender3) context.getBean("movieRecommender3");
        movieRecommender3.printHashCode();
        MovieRecommender4 movieRecommender4 = (MovieRecommender4) context.getBean("movieRecommender4");
        movieRecommender4.transferMovie();
        MovieRecommender5 movieRecommender5 = (MovieRecommender5) context.getBean("movieRecommender5");
        movieRecommender5.transferMovie();
    }

}
