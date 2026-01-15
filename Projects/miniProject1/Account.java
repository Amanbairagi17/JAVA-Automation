package Projects.miniProject1;

public abstract class Account {
    protected String name;
    protected int accountNumber;
    protected double balance;

    public Account(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
	public abstract void displayAccountType(); // abstract method

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }

    public double getBalance() {
        return balance;
    }
}
