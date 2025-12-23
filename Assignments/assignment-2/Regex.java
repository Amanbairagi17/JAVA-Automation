import java.util.Scanner;
import java.util.regex.*;

public class Regex {
    static boolean validate(String input, String regex) {
        return Pattern.matches(regex, input);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Mobile 2.Email 3.Username 4.Password 5.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            try {
                if (ch == 5) break;
                System.out.print("Enter input: ");
                String input = sc.nextLine();
                boolean result = false;

                switch (ch) {
                    case 1 -> result = validate(input, "^[6-9][0-9]{9}$");
                    case 2 -> result = validate(input, "^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
                    case 3 -> result = validate(input, "^[a-zA-Z0-9_]{5,15}$");
                    case 4 -> result = validate(input, "^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$]).{6,}$");
                }

                System.out.println(result ? "Welcome User" : "Invalid Input");
            } catch (Exception e) {
                System.out.println("Error occurred");
            }
        }
    }
}