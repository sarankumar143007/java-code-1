package Rotate;

import java.util.Arrays;

public class ArrayLeftRotation {

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; 

        for (int i = 0; i < k; i++) {
            int temp = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        int k = 2;

        System.out.println("Before rotation:");
        System.out.println(Arrays.toString(values));

        rotate(values, k);

        System.out.println("After rotation:");
        System.out.println(Arrays.toString(values));
    }
}
