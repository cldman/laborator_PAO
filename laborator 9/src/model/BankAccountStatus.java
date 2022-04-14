package model;

public enum BankAccountStatus {
    OPEN("account is open"),
    CLOSED("account is closed"),
    SUSPENDED("account is suspended");

    private String description;

    BankAccountStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
