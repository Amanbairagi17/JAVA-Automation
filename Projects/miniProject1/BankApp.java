package Projects.miniProject1;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Choose Account Type (1.Savings 2.Current): ");
        int type = sc.nextInt();

        // Runtime Polymorphism
        Account account;
        if (type == 1)
            account = new SavingsAccount(name, accNo, 0);
        else
            account = new CurrentAccount(name, accNo, 0);

        int choice;
        do {
            System.out.println("\n1.Deposit  2.Withdraw  3.Balance  4.Details  5.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Amount: ");
                    account.deposit(sc.nextDouble());
                }
                case 2 -> {
                    System.out.print("Enter Amount: ");
                    account.withdraw(sc.nextDouble());
                }
                case 3 -> System.out.println("Balance: " + account.getBalance());
                case 4 -> {
                    account.displayAccountType();
                    System.out.println("Name: " + name);
                    System.out.println("Account No: " + accNo);
                    System.out.println("Balance: " + account.getBalance());
                }
                case 5 -> FileUtil.save(account);
            }
        } while (choice != 5);

        System.out.println("Thank You!");
    }
}

