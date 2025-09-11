package Search;

public class LinearSearch {
	public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        int key = 15;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                System.out.println("Key " + key + " found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Key " + key + " not found in the array.");
        }
    }
}

