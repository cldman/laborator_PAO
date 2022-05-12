package main.service;

import main.model.Account;
import main.model.AccountType;
import main.repository.AccountRepository;

import java.util.List;
import java.util.Optional;

public class AccountService {
    private AccountRepository accountRepository;

    public AccountService() {
        this.accountRepository = new AccountRepository();
    }

    public void addAccount(Account account) {
        accountRepository.addAccount(account);
    }
    public Optional<Account> getAccountById(long id) {
        return accountRepository.getAccountById(id);
    }
    public double getTotalAmountByType(AccountType type) {
        return accountRepository.getTotalAmountByType(type);
    }

    public List<Account> getAllAccounts() {
        return accountRepository.getAllAccounts();
    }
    public Account build(String input) {
        String[] attributes = input.split("/");
        String accountNumber = attributes[0];
        double balance = Double.valueOf(attributes[1]);
        AccountType type = AccountType.valueOf(attributes[2]);
        String cardNumber = attributes[3];

        return new Account(accountNumber, balance, type, cardNumber);
    }
}
