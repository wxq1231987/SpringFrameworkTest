package annotation.based.config.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class MovieRecommender {
    @Autowired
    private MovieCatalog movieCatalog;

    @Override
    public String toString() {
        return "MovieRecommender [movieCatalog=" + movieCatalog.hashCode() + "]";
    }
}
