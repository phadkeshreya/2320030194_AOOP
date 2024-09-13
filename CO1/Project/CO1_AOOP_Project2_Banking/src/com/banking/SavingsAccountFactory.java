package com.banking;

public class SavingsAccountFactory extends AccountFactory {
	@Override
    public Account createAccount(String accountNumber) {
        return new SavingsAccount(accountNumber);
    }
}
