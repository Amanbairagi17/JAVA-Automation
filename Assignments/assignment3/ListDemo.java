package Assignments.assignment3;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {

        // Constructors
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>(10);
        ArrayList<Integer> list3 = new ArrayList<>(list1);

        // Methods
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(1, 15);
        System.out.println(list1);;
        list1.addAll(List.of(40, 50));
        list1.remove(2);
        list1.remove(Integer.valueOf(50));
        list1.get(0);
        list1.set(0, 100);
        list1.contains(20);
        list1.indexOf(20);
        list1.size();
        list1.isEmpty();
        list1.toArray();
        list1.clear();

        System.out.println(list1);
    }
}
