package Newarray;

import java.util.Arrays;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 4};
        System.out.println("Original array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("After sorting:");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
