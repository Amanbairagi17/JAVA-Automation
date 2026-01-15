package Projects.miniProject2;

import java.util.Scanner;

public class DriverClass {
	private static final String USERNAME = "admin";
    private static final String PASSWORD = "1234";

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			EmployeeManager manager = new EmployeeManager();

			// Login
			System.out.print("Username: ");
			String user = sc.nextLine();
			System.out.print("Password: ");
			String pass = sc.nextLine();

			if (!user.equals(USERNAME) || !pass.equals(PASSWORD)) {
			    System.out.println("Invalid Login!");
			    return;
			}

			while (true) {
			    System.out.println("\n1.Add Employee\n2.Display All\n3.Search by ID\n4.Update Salary\n5.Delete Employee\n6.Display Sorted\n7.Display Departments\n8.Exit");
			    System.out.print("Choice: ");
			    int choice = sc.nextInt();

			    try {
			        switch (choice) {
			            case 1 -> {
			                System.out.print("ID: ");
			                int id = sc.nextInt();
			                sc.nextLine();
			                System.out.print("Name: ");
			                String name = sc.nextLine();
			                System.out.print("Department: ");
			                String dept = sc.nextLine();
			                if (dept.isEmpty())
			                    throw new Exception("Department cannot be empty!");

			                System.out.print("Salary: ");
			                double sal = sc.nextDouble();

			                manager.addEmployee(new Employee(id, name, dept, sal));
			                System.out.println("Employee Added!");
			            }
			            case 2 -> manager.displayEmployees();
			            case 3 -> {
			                System.out.print("Enter ID: ");
			                int id = sc.nextInt();
			                Employee e = manager.searchEmployee(id);
			                System.out.println(e != null ? e : "Not found!");
			            }
			            case 4 -> {
			                System.out.print("ID: ");
			                int id = sc.nextInt();
			                System.out.print("New Salary: ");
			                double sal = sc.nextDouble();
			                manager.updateSalary(id, sal);
			                System.out.println("Salary Updated!");
			            }
			            case 5 -> {
			                System.out.print("ID: ");
			                int id = sc.nextInt();
			                manager.deleteEmployee(id);
			                System.out.println("Employee Deleted!");
			            }
			            case 6 -> manager.displaySorted();
			            case 7 -> manager.displayDepartments();
			            case 8 -> {
			                System.out.println("Exiting...");
			                return;
			            }
			            default -> System.out.println("Invalid choice!");
			        }
			    } catch (Exception e) {
			        System.out.println("Error: " + e.getMessage());
			    }
			}
		}
    }

}
