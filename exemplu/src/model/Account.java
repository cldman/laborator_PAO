package model;

public class Account {
    private long id;
    private String accountNumber;
    private double balance;
    private AccountType type;
    private String cardNumber;

    public Account(long id, String accountNumber, double balance, AccountType type, String cardNumber) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.type = type;
        this.cardNumber = cardNumber;
    }

    public Account(String accountNumber, double balance, AccountType type, String cardNumber) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.type = type;
        this.cardNumber = cardNumber;
    }
    public Account() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
