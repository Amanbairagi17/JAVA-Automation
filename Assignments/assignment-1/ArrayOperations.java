import java.util.Scanner;

public class ArrayOperations {

    public static void display(int[] arr, int n) {
        System.out.print("Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int n = 0;
        int choice;

        // 🔹 Mandatory minimum 5 inputs
        System.out.println("Enter at least 5 elements:");
        while (n < 5) {
            arr[n++] = sc.nextInt();
        }

        do {
            System.out.println("\n1.Insert");
            System.out.println("2.Delete");
            System.out.println("3.Linear Search");
            System.out.println("4.Binary Search");
            System.out.println("5.Maximum Value");
            System.out.println("6.Count Even/Odd");
            System.out.println("7.Insertion Sort");
            System.out.println("8.Display Array");
            System.out.println("9.Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (n == arr.length) {
                        System.out.println("Array is full");
                    } else {
                        System.out.print("Enter value: ");
                        arr[n++] = sc.nextInt();
                    }
                    break;

                case 2:
                    if (n == 0) {
                        System.out.println("Array is empty");
                    } else {
                        n--;
                        System.out.println("Last element deleted");
                    }
                    break;

                case 3:
                    if (n == 0) {
                        System.out.println("Array is empty");
                        break;
                    }
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] == key) {
                            found = true;
                            break;
                        }
                    }
                    System.out.println(found ? "Found" : "Not Found");
                    break;

                case 4:
                    if (n == 0) {
                        System.out.println("Array is empty");
                        break;
                    }

                    // 🔹 Sort before binary search
                    for (int i = 1; i < n; i++) {
                        int temp = arr[i];
                        int j = i - 1;
                        while (j >= 0 && arr[j] > temp) {
                            arr[j + 1] = arr[j];
                            j--;
                        }
                        arr[j + 1] = temp;
                    }

                    System.out.print("Enter element: ");
                    int item = sc.nextInt();
                    int low = 0, high = n - 1;
                    boolean flag = false;

                    while (low <= high) {
                        int mid = (low + high) / 2;
                        if (arr[mid] == item) {
                            flag = true;
                            break;
                        } else if (arr[mid] < item) {
                            low = mid + 1;
                        } else {
                            high = mid - 1;
                        }
                    }
                    System.out.println(flag ? "Found" : "Not Found");
                    break;

                case 5:
                    if (n == 0) {
                        System.out.println("Array is empty");
                        break;
                    }
                    int max = arr[0];
                    for (int i = 1; i < n; i++) {
                        if (arr[i] > max)
                            max = arr[i];
                    }
                    System.out.println("Maximum = " + max);
                    break;

                case 6:
                    int even = 0, odd = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] % 2 == 0)
                            even++;
                        else
                            odd++;
                    }
                    System.out.println("Even = " + even + ", Odd = " + odd);
                    break;

                case 7:
                    for (int i = 1; i < n; i++) {
                        int temp = arr[i];
                        int j = i - 1;
                        while (j >= 0 && arr[j] > temp) {
                            arr[j + 1] = arr[j];
                            j--;
                        }
                        arr[j + 1] = temp;
                    }
                    System.out.println("Array Sorted");
                    break;

                case 8:
                    display(arr, n);
                    break;
            }

        } while (choice != 9);

        sc.close();
    }
}
