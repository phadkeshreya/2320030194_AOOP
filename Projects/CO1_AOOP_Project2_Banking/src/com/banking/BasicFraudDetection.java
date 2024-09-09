package com.banking;

public class BasicFraudDetection implements FraudDetection {
	@Override
    public boolean isFraudulent(Transaction transaction) {
        return transaction.amount > 10000; 
    }
}
