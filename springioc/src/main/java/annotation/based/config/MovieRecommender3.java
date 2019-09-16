package annotation.based.config;

import org.springframework.beans.factory.annotation.Autowired;

public class MovieRecommender3 {
    @Autowired
    private MovieCatalog movieCatalog;
    private CustomerPreferenceDao customerPreferenceDao;
    @Autowired
    public void prepare(CustomerPreferenceDao customerPreferenceDao) {
        this.customerPreferenceDao = customerPreferenceDao;
    }
    public void printHashCode() {
        System.out.println(movieCatalog.hashCode());
        System.out.println(customerPreferenceDao.hashCode());
    }
}
