package com.banking;

public class CheckingAccountFactory extends AccountFactory {
	@Override
    public Account createAccount(String accountNumber) {
        return new CheckingAccount(accountNumber);
    }
}
