package org.xpdojo.bank;

public class Account {

    private int balance = 0;

    public Account(int balance) {
        this.balance = balance;
    }

    public static Account emptyAccount() {
        return new Account(0);
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) throws Exception {

        balance -= amount;
    }
}
