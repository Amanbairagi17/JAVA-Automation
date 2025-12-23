import java.util.Scanner;

interface BankingOperations {
    void deposit(double amount) throws Exception;
    void withdraw(double amount) throws Exception;
    void checkBalance();
}

interface CustomerDetails {
    void setCustomer(String name, String accountNo);
    void displayCustomer();
}

class BankAccount implements BankingOperations, CustomerDetails {
    private String name;
    private String accountNo;
    private double balance;

    public void setCustomer(String name, String accountNo) {
        this.name = name;
        this.accountNo = accountNo;
    }

    public void displayCustomer() {
        System.out.println("Customer: " + name + " | Account: " + accountNo);
    }

    public void deposit(double amount) throws Exception {
        if (amount <= 0) throw new Exception("Invalid deposit amount");
        balance += amount;
    }

    public void withdraw(double amount) throws Exception {
        if (amount <= 0 || amount > balance) throw new Exception("Insufficient balance");
        balance -= amount;
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class BankApp {
    public static void main(String[] args) {
        try {
            BankAccount acc = new BankAccount();
            acc.setCustomer("Kartik", "ACC123");
            acc.deposit(5000);
            acc.withdraw(1200);
            acc.displayCustomer();
            acc.checkBalance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}