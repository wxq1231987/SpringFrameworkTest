package genericity.dependency.inject;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {
    @Autowired
    public BaseRepository<T> baseRepository;
    public BaseService() {
        super();
        System.out.println("BaseService构造好了");
    }
    public void save() {
        System.out.println("调用BaseRepository进行存储");
        baseRepository.save();
    }
}
