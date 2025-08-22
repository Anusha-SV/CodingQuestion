package com.aug.TwentyOne25;
/*Design a Bank Account System using Encapsulation in Java.
👉 Requirements:
Create a class BankAccount with the following private fields:
accountNumber (String)
balance (double)

Provide:
A constructor to initialize accountNumber and balance.
Ensure that initial balance cannot be negative.
Implement the following public methods:
deposit(double amount) → increases balance only if amount > 0.
withdraw(double amount) → decreases balance only if amount ≤ balance.
getBalance() → returns current balance.
getAccountNumber() → returns account number.

In the main method (BankDemo class):
Create a bank account with some initial balance.
Perform deposit and withdrawal operations.
Try invalid operations (e.g., withdrawing more than balance, depositing negative values).
Print account details after each operation.*/

class BankAccount {
    // 🔒 Private fields
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Invalid initial balance! Set to 0.");
        }
    }

    // Deposit money (only if positive amount)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    // Withdraw money (only if sufficient balance)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Getter methods (no direct access to balance variable)
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

// Test class
public class BankDemo {
    public static void main(String[] args) {
        // Create account
        BankAccount account = new BankAccount("ACC123", 1000);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        // Perform operations
        account.deposit(500);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(300);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        // Invalid cases
        account.withdraw(2000);  // should fail
        account.deposit(-100);   // should fail
    }

	
	
}


