package model;

public class DebitBankAccount extends BankAccount{
    private String cardNumber;
    private Double withdrwallLimit;

    public DebitBankAccount(Client client, double balance, String accountNumber, BankAccountStatus status, String cardNumber, Double withdrwallLimit) {
        super(client, balance, accountNumber, status);
        this.cardNumber = cardNumber;
        this.withdrwallLimit = withdrwallLimit;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Double getWithdrwallLimit() {
        return withdrwallLimit;
    }

    public void setWithdrwallLimit(Double withdrwallLimit) {
        this.withdrwallLimit = withdrwallLimit;
    }

    @Override
    public String toString() {
        return "DebitBankAccount{" +
                "withdrawalLimit='" + cardNumber + '\'' +
                ", withdrwallLimit=" + withdrwallLimit +
                '}';
    }
}
