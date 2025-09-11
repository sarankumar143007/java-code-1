package Binary;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchprac {
    public static int binarysearch(int[] num, int key1) {
        int n = num.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (num[mid] == key1) {
                return mid;
            } else if (num[mid] < key1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {20, 3, 2, 10, 5, 6};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter key to search:");
        int key = sc.nextInt();
        sc.close();

        int pos = binarysearch(numbers, key);
        System.out.println("Position = " + pos);
    }
}
