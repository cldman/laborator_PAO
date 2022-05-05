package main;

import main.model.Account;
import main.model.AccountType;
import main.service.AccountService;

import java.util.Optional;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Please type one of the following commands: create, get, get total, exit");
            String command = scanner.nextLine();
            switch (command) {
                case "create": {
                    System.out.println("specify account to be inserted as: accountNumber/balance/type/cardNumber");
                    Account account = accountService.build(scanner.nextLine());
                    accountService.addAccount(account);
                    break;
                }

                case "get": {
                    System.out.println("Please specify the account id:");
                    Optional<Account> account = accountService.getAccountById(Long.valueOf(scanner.nextLine()));
                    if(account.isPresent()){
                        System.out.println(account.get());
                    } else {
                        System.out.println("No account found for given id!");
                    }
                    break;
                }
                case "get total": {
                    System.out.println("Please specify the account type(DEBIT or CREDIT):");
                    System.out.println(accountService.getTotalAmountByType(AccountType.valueOf(scanner.nextLine())));
                    break;
                }
                case "exit": {
                    System.out.println("Bye....");
                    System.exit(0);
                }
                default:
                    System.out.println("Command does not exist.");
            }

        }

    }
}
