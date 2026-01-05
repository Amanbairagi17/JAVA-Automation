package Projects.miniProject1;

import java.io.FileWriter;
import java.io.IOException;

class FileUtil {
    public static void save(Account acc) {
        try {
            FileWriter fw = new FileWriter("accounts.txt", true);
            fw.write(acc.name + "," + acc.accountNumber + "," + acc.balance + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("File Error");
        }
    }
}
