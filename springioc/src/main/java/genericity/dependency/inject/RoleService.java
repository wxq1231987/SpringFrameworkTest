package genericity.dependency.inject;

import org.springframework.stereotype.Service;

@Service
public class RoleService extends BaseService<Role> {
    public void save() {
        System.out.println("±£¥Ê role∂‘œÛ");
    }
}
