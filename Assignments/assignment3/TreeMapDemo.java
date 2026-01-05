package Assignments.assignment3;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {

        // Constructors
        TreeMap<Integer, String> tm1 = new TreeMap<>();
        TreeMap<Integer, String> tm2 = new TreeMap<>(Comparator.reverseOrder());
        TreeMap<Integer, String> tm3 = new TreeMap<>(tm1);
        TreeMap<Integer, String> tm4 = new TreeMap<>(Map.of(1,"A",2,"B"));

        // Methods
        tm1.put(1, "A");
        tm1.put(2, "B");
        tm1.put(3, "C");
        tm1.get(1);
        tm1.remove(2);
        tm1.firstKey();
        tm1.lastKey();
        tm1.higherKey(1);
        tm1.lowerKey(3);
        tm1.ceilingKey(2);
        tm1.floorKey(2);
        tm1.pollFirstEntry();
        tm1.pollLastEntry();
        tm1.size();
        tm1.clear();

        System.out.println(tm1);
    }
}
