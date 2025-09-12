package occurrence;

public class LastOccur {

    static int lastOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid;
                low = mid + 1; // Keep searching to the right
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    // Optional: Main method for testing
    public static void main(String[] args) {
        int[] arr = {2,4,10,10,10,18,20};
        int target = 20;
        int index = lastOccurrence(arr, target);
        if (index != -1) {
            System.out.println("Last occurrence of " + target + " is at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
