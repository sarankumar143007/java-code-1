package UniqueElement;
import java.util.*;
public class UniqueNumbers {
	 public static void main(String[] args) {
	        // Input: Array or ArrayList Created
	        List<Integer> inputList = Arrays.asList(1, 4, 5, 3, 2, 1, 2, 6, 4);
	        Set<Integer> uniqueElements = new HashSet<>(inputList);

	        //print Statement
	        System.out.println("Unique size: " + uniqueElements.size());
	    }
	}

