package Assignments.assignment3;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {

        // Constructors
        Vector<String> v1 = new Vector<>();
        Vector<String> v2 = new Vector<>(5);
        Vector<String> v3 = new Vector<>(5, 2);
        Vector<String> v4 = new Vector<>(v1);

        // Methods
        v1.add("A");
        v1.addElement("B");
        v1.add(1, "C");
        v1.get(0);
        v1.set(0, "X");
        v1.remove("B");
        v1.remove(0);
        v1.contains("C");
        v1.size();
        v1.capacity();
        v1.isEmpty();
        v1.firstElement();
        v1.lastElement();
        v1.clear();
        v1.toArray();

        System.out.println(v1);
    }
}
