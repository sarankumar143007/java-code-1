package NewModule;
import java.util.*;
public class MapExample_4 {
	 public static void main(String[] args) {

	        // Create a HashMap
	        Map<String, Integer> map = new HashMap<>();

	        // Add key-value pairs using put()
	        map.put("Apple", 10);
	        map.put("Banana", 20);
	        map.put("Orange", 30);
	        map.put("Mango", 40);

	        // Display the map
	        System.out.println("Map contents: " + map);

	        // Get value associated with a key using get()
	        System.out.println("Value for 'Banana': " + map.get("Banana"));

	        // Check if a key exists using containsKey()
	        System.out.println("Contains key 'Apple'? " + map.containsKey("Apple"));

	        // Check if a value exists using containsValue()
	        System.out.println("Contains value 30? " + map.containsValue(30));

	        // Remove a key-value pair
	        map.remove("Orange");
	        System.out.println("After removing 'Orange': " + map);

	        // Replace a value for a specific key
	        map.replace("Mango", 50);
	        System.out.println("After replacing 'Mango' value: " + map);

	        // Iterate over keys and values
	        System.out.println("Iterating through the map:");
	        for (Map.Entry<String, Integer> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + " => " + entry.getValue());
	        }

	        // Clear the map
	        map.clear();
	        System.out.println("After clearing: " + map);
	    }
	}
