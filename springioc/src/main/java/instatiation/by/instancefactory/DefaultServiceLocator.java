package instatiation.by.instancefactory;

public class DefaultServiceLocator {
    private ClientService clientService = new ClientService();
    private AccountService accountService = new AccountService();
    public ClientService createClientService() {
        return clientService;
    }
    public AccountService createAccountService() {
        return accountService;
    }
}