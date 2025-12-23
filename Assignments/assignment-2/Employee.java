import java.util.*;
import java.util.regex.*;

interface EmployeeService {
    void add(int id, String name);
    void display();
    void search(int id);
    void remove(int id);
}

class EmployeeManager implements EmployeeService {
    HashMap<Integer, String> hashMap = new HashMap<>();
    Hashtable<Integer, String> hashtable = new Hashtable<>();
    TreeMap<Integer, String> treeMap = new TreeMap<>();

    public void add(int id, String name) {
        hashMap.put(id, name);
        hashtable.put(id, name);
        treeMap.put(id, name);
    }

    public void display() {
        System.out.println(hashMap);
        System.out.println(hashtable);
        System.out.println(treeMap);
    }

    public void search(int id) {
        System.out.println(hashMap.get(id));
    }

    public void remove(int id) {
        hashMap.remove(id);
        hashtable.remove(id);
        treeMap.remove(id);
    }
}

public class EmployeeApp {
    public static void main(String[] args) {
        try {
            EmployeeManager em = new EmployeeManager();
            em.add(101, "Raj");
            em.add(102, "Neha");
            em.display();
            em.search(101);
            em.remove(102);
            em.display();
        } catch (Exception e) {
            System.out.println("Error handled");
        }
    }
}