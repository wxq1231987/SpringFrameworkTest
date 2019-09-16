package resource.dependency.inject;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
@Component
public class SimpleMovieLister2 {
    private MovieFinder movieFinder;
    @Resource
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }
    public void print() {
        System.out.println(movieFinder.toString());
    }
}
