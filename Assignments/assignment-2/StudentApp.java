import java.util.*;
import java.util.regex.*;

interface StudentService {
    void addStudent(Student s);
    void display();
    Student search(int roll);
    void remove(int roll);
}

class Student {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public String toString() {
        return roll + " " + name;
    }
}

class StudentManager implements StudentService {
    List<Student> list = new ArrayList<>();
    Vector<Student> vector = new Vector<>();

    public void addStudent(Student s) {
        list.add(s);
        vector.add(s);
    }

    public void display() {
        list.forEach(System.out::println);
    }

    public Student search(int roll) {
        for (Student s : list)
            if (s.roll == roll) return s;
        return null;
    }

    public void remove(int roll) {
        list.removeIf(s -> s.roll == roll);
    }
}

public class StudentApp {
    public static void main(String[] args) {
        try {
            StudentManager sm = new StudentManager();
            sm.addStudent(new Student(1, "Aman"));
            sm.addStudent(new Student(2, "Riya"));
            sm.display();
            System.out.println(sm.search(2));
            sm.remove(1);
            sm.display();
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }
}