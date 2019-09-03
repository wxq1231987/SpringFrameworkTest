package instatiation.by.instancefactory;

public class ClientService {
    private String name;

    public ClientService() {
        super();
        this.name = "我是动态工程造出来的实例";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
