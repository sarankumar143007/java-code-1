package Repeated;
import java.util.*;
public class FirstRepeatedElement {
	
	  // Function to find the first repeated number
    public static Integer findFirstRepeated(List<Integer> numbers) {
        Set<Integer> seen = new HashSet<>();
        for (Integer num : numbers) {
            if (seen.contains(num)) {
                return num; 
            }
            seen.add(num);
        }
        return null; 
    }

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(1, 4, 5, 3, 2, 2, 8, 4);
        
        Integer firstRepeated = findFirstRepeated(inputList);
        
        if (firstRepeated != null) {
            System.out.println("First repeated element: " + firstRepeated);
        } else {
            System.out.println("No repeated elements found.");
        }
    }
}

