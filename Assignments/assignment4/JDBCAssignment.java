package Assignments.assignment4;
import java.sql.*;

public class JDBCAssignment {

    // Database credentials
    static final String URL = "jdbc:mysql://localhost:3306/technocrats";
    static final String USER = "root";
    static final String PASSWORD = "Sql@0001";

    public static void main(String[] args) {

        checkConnection();            // Q1
        createTableAndInsert();       // Q2
        increasePercentage();         // Q3
        deleteStudents();             // Q4
        displayStudents();            // Q5
    }

    // 1️⃣ Check JDBC Connection
    static void checkConnection() {
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection Successful");
            con.close();
        } catch (Exception e) {
            System.out.println("Unable to connect");
        }
    }

    // 2️⃣ Create table & Insert records
    static void createTableAndInsert() {
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {

            Statement st = con.createStatement();

            String createTable =
                    "CREATE TABLE IF NOT EXISTS Students (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "name VARCHAR(50)," +
                    "branch VARCHAR(10)," +
                    "semester INT," +
                    "percentage DOUBLE," +
                    "year_of_passing INT)";

            st.execute(createTable);

            String insert =
                    "INSERT INTO Students(name, branch, semester, percentage, year_of_passing) " +
                    "VALUES ('Aman','CSE',7,75,2025)," +
                    "('Ravi','Civil',6,70,2024)," +
                    "('Neha','EC',7,80,2025)";

            st.executeUpdate(insert);

            System.out.println("Table created and records inserted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 3️⃣ Increase 5% for CSE students
    static void increasePercentage() {
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {

            String query =
                    "UPDATE Students SET percentage = percentage + (percentage * 0.05) " +
                    "WHERE branch = 'CSE'";

            PreparedStatement ps = con.prepareStatement(query);
            int rows = ps.executeUpdate();

            System.out.println(rows + " CSE student(s) updated");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 4️⃣ Delete Civil students passed in 2024
    static void deleteStudents() {
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {

            String query =
                    "DELETE FROM Students WHERE year_of_passing = 2024 AND branch = 'Civil'";

            PreparedStatement ps = con.prepareStatement(query);
            int rows = ps.executeUpdate();

            System.out.println(rows + " student(s) deleted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 5️⃣ Display EC students of semester 7
    static void displayStudents() {
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {

            String query =
                    "SELECT * FROM Students WHERE semester = 7 AND branch = 'EC'";

            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            System.out.println("\nEC Students (Semester 7):");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name") + " " +
                        rs.getDouble("percentage"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
