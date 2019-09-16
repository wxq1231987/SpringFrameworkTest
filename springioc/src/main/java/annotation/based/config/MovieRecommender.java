package annotation.based.config;

import org.springframework.beans.factory.annotation.Autowired;

public class MovieRecommender {
    private CustomerPreferenceDao customerPreferenceDao;

    @Autowired
    private MovieRecommender(CustomerPreferenceDao customerPreferenceDao) {
        super();
        this.customerPreferenceDao = customerPreferenceDao;
    }
    public void execute() {
        System.out.println(customerPreferenceDao.toString());
    }
}
