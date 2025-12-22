import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];

        System.out.println("Enter matrix elements 3 * 3 : ");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Transpose:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(a[j][i] + " ");
            System.out.println();
        }

        boolean diagonal = true;
        boolean identity = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i != j && a[i][j] != 0)
                    diagonal = false;
                if ((i == j && a[i][j] != 1) || (i != j && a[i][j] != 0))
                    identity = false;
            }
        }

        System.out.println(diagonal ? "Diagonal Matrix" : "Not Diagonal");
        System.out.println(identity ? "Identity Matrix" : "Not Identity");

        sc.close();
    }
}
