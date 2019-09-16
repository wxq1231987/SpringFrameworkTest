package annotation.based.config;

import org.springframework.beans.factory.annotation.Autowired;

public class MovieRecommender4 {
    private Movie[] movies;

    @Autowired
    public void setMovies(Movie[] movies) {
        this.movies = movies;
    }

    public void transferMovie() {
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
    }
}
