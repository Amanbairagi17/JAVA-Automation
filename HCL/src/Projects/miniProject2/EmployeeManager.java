package Projects.miniProject2;

import java.io.*;
import java.util.*;

public class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();
    private final String FILE_NAME = "employees.txt";

    public EmployeeManager() {
        loadFromFile();
    }

    // Add Employee
    public void addEmployee(Employee emp) throws Exception {
        for (Employee e : employees) {
            if (e.getId() == emp.getId())
                throw new Exception("Employee ID must be unique!");
        }
        employees.add(emp);
        saveToFile();
    }

    // Display All
    public void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }
        employees.forEach(System.out::println);
    }

    // Search by ID
    public Employee searchEmployee(int id) {
        for (Employee e : employees) {
            if (e.getId() == id)
                return e;
        }
        return null;
    }

    // Update Salary
    public void updateSalary(int id, double salary) throws Exception {
        if (salary <= 0)
            throw new Exception("Salary must be positive!");

        Employee e = searchEmployee(id);
        if (e == null)
            throw new Exception("Employee not found!");

        e.setSalary(salary);
        saveToFile();
    }

    // Delete Employee
    public void deleteEmployee(int id) throws Exception {
        Employee e = searchEmployee(id);
        if (e == null)
            throw new Exception("Employee not found!");

        employees.remove(e);
        saveToFile();
    }

    // Display Sorted Employees
    public void displaySorted() {
        employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);
    }

    // Display Departments
    public void displayDepartments() {
        Set<String> departments = new HashSet<>();
        for (Employee e : employees) {
            departments.add(e.getDepartment());
        }
        departments.forEach(System.out::println);
    }

    // File Handling
    private void saveToFile() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Employee e : employees) {
                pw.println(e);
            }
        } catch (IOException e) {
            System.out.println("Error saving file!");
        }
    }

    private void loadFromFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                employees.add(new Employee(
                        Integer.parseInt(data[0]),
                        data[1],
                        data[2],
                        Double.parseDouble(data[3])
                ));
            }
        } catch (Exception e) {
            System.out.println("Error loading file!");
        }
    }
}

