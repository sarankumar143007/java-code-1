package Method;
import java.util.*;
public class MapExample_2 {
	public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, ".Net");
        map.put(2, "Python");
        map.put(3, "C++");

        String value1 = map.get(1);
        String value2 = map.get(4); // This key doesn't exist

        System.out.println("Value for key 1: " + value1);
        System.out.println("Value for key 4: " + value2);
    }
}

