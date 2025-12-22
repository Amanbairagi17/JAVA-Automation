import java.util.Scanner;

public class BankManagement {

    static double balance = 0;

    static void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited");
    }

    static void withdraw(double amount) {
        if (amount > balance) {
            throw new ArithmeticException("Insufficient Balance");
        }
        balance -= amount;
        System.out.println("Amount Withdrawn");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Balance Enquiry");
            System.out.println("4.Exit");

            choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter amount: ");
                        deposit(sc.nextDouble());
                        break;

                    case 2:
                        System.out.print("Enter amount: ");
                        withdraw(sc.nextDouble());
                        break;

                    case 3:
                        System.out.println("Balance = " + balance);
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } while (choice != 4);

        sc.close();
    }
}
