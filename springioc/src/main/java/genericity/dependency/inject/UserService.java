package genericity.dependency.inject;

import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<User> {
}