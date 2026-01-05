package Projects.miniProject1;

public class SavingsAccount extends Account {

    public SavingsAccount(String name, int accNo, double balance) {
        super(name, accNo, balance);
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}

