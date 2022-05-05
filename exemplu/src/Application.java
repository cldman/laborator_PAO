import model.Account;
import model.AccountType;
import service.AccountService;

import java.util.Optional;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Please type one of the following commands: create, get, get total amount, exit");
            String line = scanner.nextLine();
            switch(line) {
                case "create" : {
                    addBankAccount(accountService, scanner);
                    break;
                }
                case "get" : {
                    System.out.println("Please specify the id of the account:");
                    Optional<Account> bankAccount =
                            accountService.getBankAccountById(Long.valueOf(scanner.nextLine()));
                    if(bankAccount.isPresent()) {
                        System.out.println(bankAccount.get());
                    }
                    break;
                }
                case "get total amount" : {
                    System.out.println("Please specify the bank account type: ");
                    System.out.println(accountService.getTotalAmountByType(AccountType.valueOf(scanner.nextLine())));
                    break;
                }
                case "exit" : {
                    System.out.println("Bye...");
                    System.exit(0);
                }
                default : System.out.println("This command doesn't exist.");
            }
        }
    }

    private static void addBankAccount(AccountService accountService, Scanner scanner) {

        System.out.println("Please specify the bank account details: accountNumber/balance/type/cardNumber");
        try {
            Account account = accountService.build(scanner.nextLine());
            accountService.addBankAccount(account);
        } catch (NumberFormatException e) {
            System.out.println("Invalid inputs for bank account creation. The bank account was not saved in the db.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Not enough inputs for bank account creation. The bank account was not saved in the db.");
        }
    }
}
