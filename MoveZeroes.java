package Zeroes;

import java.util.Arrays; // ✅ Required for Arrays.toString()

public class MoveZeroes {
    // Function to move all zeroes to the end while maintaining the order of non-zero elements
    public static void moveZeroes(int[] arr) {
        int index = 0; // Position to place the next non-zero element

        // Move non-zero elements to the beginning
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        // Fill the rest with zeroes
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println("Before: " + Arrays.toString(nums));
        moveZeroes(nums);
        System.out.println("After:  " + Arrays.toString(nums)); // Output: [1, 3, 12, 0, 0]
    }
}
