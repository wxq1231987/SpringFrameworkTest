package instatiation.by.staticfactory;

public class ClientService {
    private static ClientService clientService = new ClientService();
    private String name;
    
    public ClientService() {
        super();
        this.name = "“µŒÒ¿‡";
    }

    public static ClientService createClientService() {
        return clientService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
