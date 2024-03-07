import java.util.Scanner;

class Account {
    private String accountNumber;
    private String pin;
    private double balance;

    public Account(String accountNumber, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public boolean validatePin(String enteredPin) {
        return pin.equals(enteredPin);
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        displayBalance();
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Sorry! Insufficient funds");
            System.out.println("_________________________");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            displayBalance();
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}




