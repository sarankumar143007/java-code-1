package reverse;

import java.util.Arrays; // ✅ Import added

public class ReverseanArray {

    public static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Before reverse: " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("After reverse: " + Arrays.toString(arr));
    }
}
