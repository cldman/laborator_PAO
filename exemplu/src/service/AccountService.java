package service;

import model.Account;
import model.AccountType;
import repository.AccountRepository;

import java.util.Optional;

public class AccountService {
    private AccountRepository accountRepository;

    public AccountService() {
        this.accountRepository = new AccountRepository();
    }

    public Account build(String bankAccountDetails) {
        String[] attributes = bankAccountDetails.split("/");
        String accountNumber = attributes[0];
        double balance = Double.valueOf(attributes[1]);
        AccountType type = AccountType.valueOf(attributes[2]);
        String cardNumber = attributes[3];
        return new Account(accountNumber, balance, type, cardNumber);
    }

    public void addBankAccount(Account bankAccount) {
        accountRepository.addBankAccount(bankAccount);
    }

    public Optional<Account> getBankAccountById(long id) {
        return accountRepository.getBankAccountById(id);
    }

    public double getTotalAmountByType(AccountType type) {
        return accountRepository.getTotalAmountByType(type);
    }

}
