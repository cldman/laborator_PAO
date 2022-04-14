package service;

import model.BankAccount;
import model.BankAccountStatus;
import model.Client;
import model.DebitBankAccount;
import model.SavingsBankAccount;

import java.util.Comparator;
import java.util.List;
import java.util.Random;

import static model.BankAccountStatus.CLOSED;
import static model.BankAccountStatus.OPEN;
import static model.BankAccountStatus.SUSPENDED;

public class BankAccountService {
    private static final Random RANDOM = new Random();

    private ClientService clientService;

    public BankAccountService(ClientService clientService) {
        this.clientService = clientService;
    }

    public List<BankAccount> getBankAccounts() {
        List<Client> clients = clientService.getClients();
        return List.of(new DebitBankAccount(clients.get(0), 1000, String.valueOf(RANDOM.nextInt(10)), OPEN,
                        String.valueOf(RANDOM.nextInt(12)), 100d),
                new DebitBankAccount(clients.get(1), 2000, String.valueOf(RANDOM.nextInt(10)), CLOSED,
                        String.valueOf(RANDOM.nextInt(12)), 50d),
                new DebitBankAccount(clients.get(2), 2500, String.valueOf(RANDOM.nextInt(10)), SUSPENDED,
                        String.valueOf(RANDOM.nextInt(12)), 150d),
                new SavingsBankAccount(clients.get(3), 2000, String.valueOf(RANDOM.nextInt(10)), OPEN, 3),
                new SavingsBankAccount(clients.get(4), 1700, String.valueOf(RANDOM.nextInt(10)), SUSPENDED, 4),
                new SavingsBankAccount(clients.get(3), 2000, String.valueOf(RANDOM.nextInt(10)), CLOSED, 7),
                new SavingsBankAccount(clients.get(0), 2000, String.valueOf(RANDOM.nextInt(10)), CLOSED, 7));
    }


    public long getNumberOfBankAccountsForEmail(List<BankAccount> accounts, String email){
        return accounts.stream()
                .filter(account -> account.getClient() != null)
                .filter(account -> account.getClient().getEmail() != null)
                .filter(account -> account.getClient().getEmail().equals(email))
                .count();
    }

    public void printUniqueClientDetails(List<BankAccount> accounts) {
        accounts.stream()
                .map(BankAccount::getClient)
                .distinct()
                .forEach(client -> System.out.println(client.getName() + " / " + client.getEmail()));
    }

    public void printSavingsBankAccountsByBalance(List<BankAccount> accounts) {
        accounts.stream()
                .filter(account -> account instanceof SavingsBankAccount)
                .sorted()
                .forEach(System.out::println);
    }

    public void printClosedBankAccounts() {
        getBankAccounts().stream()
                .filter(account -> BankAccountStatus.CLOSED.equals(account.getStatus()))
                .sorted(Comparator.comparing(BankAccount::getAccountNumber))
                .forEach(System.out::println);
    }
}
