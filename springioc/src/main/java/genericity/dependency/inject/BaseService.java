package genericity.dependency.inject;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {
    @Autowired
    public BaseRepository<T> baseRepository;
    public BaseService() {
        super();
        System.out.println("BaseService�������");
    }
    public void save() {
        System.out.println("����BaseRepository���д洢");
        baseRepository.save();
    }
}
