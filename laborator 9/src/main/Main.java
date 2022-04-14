package main;

import model.BankAccount;
import service.BankAccountService;
import service.ClientService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BankAccountService bankAccountService = new BankAccountService(ClientService.getInstance());

        List<BankAccount> accounts = bankAccountService.getBankAccounts();

        System.out.println("Number of accounts for alin@gmail.com: " + bankAccountService.getNumberOfBankAccountsForEmail(accounts, "alin@gmail.com"));

        bankAccountService.printUniqueClientDetails(accounts);

        bankAccountService.printSavingsBankAccountsByBalance(accounts);

        bankAccountService.printClosedBankAccounts();
    }
}
