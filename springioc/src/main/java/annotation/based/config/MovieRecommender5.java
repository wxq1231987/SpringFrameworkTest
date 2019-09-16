package annotation.based.config;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

public class MovieRecommender5 {
    private Set<Movie> movies;

    @Autowired
    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

    public void transferMovie() {
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
    }
}
