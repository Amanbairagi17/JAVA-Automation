import java.util.*;
import java.util.regex.*;

class UniStudent {
    int id;
    String course;
    int marks;

    UniStudent(int id, String course, int marks) {
        this.id = id;
        this.course = course;
        this.marks = marks;
    }

    public String toString() {
        return id + " " + course + " " + marks;
    }
}

public class UniversitySystem {
    ArrayList<UniStudent> students = new ArrayList<>();
    Stack<UniStudent> stack = new Stack<>();
    Set<String> courses = new HashSet<>();
    HashMap<Integer, UniStudent> map = new HashMap<>();

    void add(UniStudent s) {
        students.add(s);
        stack.push(s);
        courses.add(s.course);
        map.put(s.id, s);
    }

    void display() {
        students.forEach(System.out::println);
    }

    void sortByMarks() {
        students.sort(Comparator.comparingInt(a -> a.marks));
    }

    void courseCount() {
        Map<String, Integer> count = new HashMap<>();
        for (UniStudent s : students)
            count.put(s.course, count.getOrDefault(s.course, 0) + 1);
        System.out.println(count);
    }

    void convertToTreeMap() {
        TreeMap<Integer, UniStudent> tm = new TreeMap<>(map);
        System.out.println(tm);
    }

    public static void main(String[] args) {
        try {
            UniversitySystem us = new UniversitySystem();
            us.add(new UniStudent(1, "CSE", 85));
            us.add(new UniStudent(2, "ECE", 78));
            us.add(new UniStudent(3, "CSE", 92));

            us.display();
            us.sortByMarks();
            us.display();
            us.courseCount();
            us.convertToTreeMap();
            System.out.println(us.courses);
        } catch (Exception e) {
            System.out.println("Handled");
        }
    }
}