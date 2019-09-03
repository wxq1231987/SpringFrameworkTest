package dependency.inject.constructor;

public class SimpleMovieLister {
    private MovieFinder movieFinder;

    public SimpleMovieLister(MovieFinder movieFinder) {
        super();
        this.movieFinder = movieFinder;
    }
}
