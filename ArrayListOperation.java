package Listoperation;

import java.util.ArrayList;

public class ArrayListOperation {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("Initial Size: " + arr.size());
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);

        // Adding element at index 1
        arr.add(1, 99);

        System.out.println("After adding elements: " + arr);
        System.out.println("Size after insert: " + arr.size());

        // Accessing element at index 2
        System.out.println("Element at index 2: " + arr.get(2));

        // Modifying element at index 2
        arr.set(2, 100);
        System.out.println("After modifying index 2: " + arr);

        // Checking if it contains value
        System.out.println("Contains 20: " + arr.contains(20));

        // Getting index of value
        System.out.println("Index of 50: " + arr.indexOf(50));

        // Removing elements by value and index
        arr.remove(Integer.valueOf(50)); // remove by value
        arr.remove(Integer.valueOf(10)); // remove by value
        arr.remove(0); // remove by index

        System.out.println("After removals: " + arr);

        // Iterating using for-each loop
        System.out.println("Iterating using for-each:");
        for (Integer num : arr) {
            System.out.println(num + " ");
        }

        // Clearing the list
        arr.clear();
        System.out.println("Is Empty: " + arr.isEmpty());
    }
}
