package com.banking;

public class BankingSystem {
	private FraudDetection fraudDetection;

    public BankingSystem(FraudDetection fraudDetection) {
        this.fraudDetection = fraudDetection;
    }

    public void performTransaction(Transaction transaction) {
        if (fraudDetection.isFraudulent(transaction)) {
            System.out.println("Transaction flagged as fraudulent");
        } else {
            transaction.execute();
        }
    }

    public static void main(String[] args) {
        AccountFactory savingsFactory = new SavingsAccountFactory();
        AccountFactory checkingFactory = new CheckingAccountFactory();

        Account savings = savingsFactory.createAccount("SA12345");
        Account checking = checkingFactory.createAccount("CA12345");

        BankingSystem bankingSystem = new BankingSystem(new BasicFraudDetection());

        Transaction deposit = new Deposit(savings, 5000);
        Transaction withdrawal = new Withdrawal(checking, 2000);

        bankingSystem.performTransaction(deposit);
        bankingSystem.performTransaction(withdrawal);

        Transaction largeWithdrawal = new Withdrawal(savings, 15000);
        bankingSystem.performTransaction(largeWithdrawal);
    }
}
