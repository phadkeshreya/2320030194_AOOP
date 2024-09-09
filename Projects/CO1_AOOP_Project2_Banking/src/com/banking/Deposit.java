package com.banking;

public class Deposit extends Transaction {
	public Deposit(Account account, double amount) {
        super(account, amount);
    }

    @Override
    public void execute() {
        account.deposit(amount);
        System.out.println("Deposited " + amount + " to account " + account.getAccountNumber());
    }
}
