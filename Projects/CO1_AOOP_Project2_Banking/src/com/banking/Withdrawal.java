package com.banking;

public class Withdrawal extends Transaction {
	public Withdrawal(Account account, double amount) {
        super(account, amount);
    }

    @Override
    public void execute() {
        account.withdraw(amount);
        System.out.println("Withdrew " + amount + " from account " + account.getAccountNumber());
    }
}
