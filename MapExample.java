package Map;
import java.util.*;
public class MapExample {
	public static void main(String[] args) {
        // Creating  a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Insert values
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        map.put(2, "Blueberry"); // "Banana" will be replaced
    
        System.out.println("Map after put operations: " + map);
    }
}
	
