package model;

public class SavingsBankAccount extends BankAccount{

    private int term;

    public SavingsBankAccount(Client client, double balance, String accountNumber, BankAccountStatus status, int term) {
        super(client, balance, accountNumber, status);
        this.term = term;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    @Override
    public String toString() {
        return "SavingsBankAccount{" +
                "client=" + client +
                ", balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", status=" + status +
                ", term=" + term +
                '}';
    }
}
