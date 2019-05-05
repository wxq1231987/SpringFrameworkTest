package aspect.test;

public class Account {
    String name;
    String acquire;
    public Account(String name, String acquire) {
        super();
        this.name = name;
        this.acquire = acquire;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAcquire() {
        return acquire;
    }
    public void setAcquire(String acquire) {
        this.acquire = acquire;
    }
}
