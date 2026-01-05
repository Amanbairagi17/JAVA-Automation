package Projects.miniProject1;

public class CurrentAccount extends Account {

    public CurrentAccount(String name, int accNo, double balance) {
        super(name, accNo, balance);
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Current Account");
    }
}

