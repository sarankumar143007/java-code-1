package FirstNonRepeating;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static char findFirstNonRepeatingCharacter(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count frequency of each character
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Find the first character with frequency 1
        for (char c : str.toCharArray()) {
            if (frequencyMap.get(c) == 1) {
                return c;
            }
        }

        // If no non-repeating character is found
        return '\0'; 
    }

    public static void main(String[] args) {
        String str = "aabbc";
        char result = findFirstNonRepeatingCharacter(str);
        
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
