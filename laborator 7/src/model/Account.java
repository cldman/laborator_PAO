package model;

import java.util.Objects;

public class Account implements Comparable<Account>{
    private int balance;
    private String accountNumber;

    public Account(int balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    @Override
    public int compareTo(Account o) {
        if(this.balance > o.balance) {
            return 1;
        } else if(this.balance == o.balance) {
            return 0;
        } else {
            return -1;
        }
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
    //do not do this
    /*@Override
    public boolean equals(Object o) {
        return true;
    }*/
    //do not do this
   /* @Override
    public int hashCode() {
        return 1;
    }*/
}
