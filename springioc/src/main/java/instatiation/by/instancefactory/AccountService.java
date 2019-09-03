package instatiation.by.instancefactory;

public class AccountService {
    private String name;

    public AccountService() {
        super();
        this.name = "账户服务类";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}