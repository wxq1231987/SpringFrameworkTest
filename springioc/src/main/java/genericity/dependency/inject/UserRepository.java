package genericity.dependency.inject;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends BaseRepository<User> {
    @Override
    public void save() {
        System.out.println("UserRepository saveUser");
    }
}
