package Method_3;
import java.util.*;
public class MapExample_3 {
	public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(10, "Black");
        map.put(20, "Pink");
        map.put(30, "Red");

        System.out.println("Original Map: " + map);

        
        map.remove(20);

        System.out.println("Map after removing key 20: " + map);

        map.remove(100);
        System.out.println("Map after trying to remove key 100: " + map);
    }
}
