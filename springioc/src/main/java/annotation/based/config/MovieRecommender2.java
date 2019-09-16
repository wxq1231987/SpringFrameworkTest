package annotation.based.config;

import org.springframework.beans.factory.annotation.Autowired;

public class MovieRecommender2 {
    private MovieCatalog movieCatalog;
    private CustomerPreferenceDao customerPreferenceDao;
    @Autowired
    public void prepare(MovieCatalog movieCatalog, CustomerPreferenceDao customerPreferenceDao) {
        this.movieCatalog = movieCatalog;
        this.customerPreferenceDao = customerPreferenceDao;
    }
    public void printHashCode() {
        System.out.println(movieCatalog.hashCode());
        System.out.println(customerPreferenceDao.hashCode());
    }
}
