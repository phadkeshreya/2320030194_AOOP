package com.banking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankingSystemTest {
	private Account savingsAccount;
    private Account checkingAccount;
    private FraudDetection fraudDetection;
    private BankingSystem bankingSystem;

    @BeforeEach
    void setUp() {
        savingsAccount = new SavingsAccount("SA12345");
        checkingAccount = new CheckingAccount("CA12345");
        fraudDetection = new BasicFraudDetection();
        bankingSystem = new BankingSystem(fraudDetection);
    }

    @Test
    void testAccountCreation() {
        assertNotNull(savingsAccount);
        assertNotNull(checkingAccount);
        assertEquals(0.0, savingsAccount.getBalance());
        assertEquals(0.0, checkingAccount.getBalance());
    }

    @Test
    void testDeposit() {
        Transaction deposit = new Deposit(savingsAccount, 5000);
        bankingSystem.performTransaction(deposit);
        assertEquals(5000, savingsAccount.getBalance());

        deposit = new Deposit(checkingAccount, 3000);
        bankingSystem.performTransaction(deposit);
        assertEquals(3000, checkingAccount.getBalance());
    }

    @Test
    void testWithdrawal() {
        Transaction deposit = new Deposit(savingsAccount, 5000);
        bankingSystem.performTransaction(deposit);

        Transaction withdrawal = new Withdrawal(savingsAccount, 2000);
        bankingSystem.performTransaction(withdrawal);
        assertEquals(3000, savingsAccount.getBalance());
    }

    @Test
    void testOverdraftPrevention() {
        Transaction withdrawal = new Withdrawal(savingsAccount, 2000);
        bankingSystem.performTransaction(withdrawal);
        assertEquals(0, savingsAccount.getBalance());
    }

    @Test
    void testFraudDetection() {
        Transaction largeWithdrawal = new Withdrawal(savingsAccount, 15000);
        bankingSystem.performTransaction(largeWithdrawal);
        assertEquals(0, savingsAccount.getBalance()); // Should not change due to fraud detection
    }
}
