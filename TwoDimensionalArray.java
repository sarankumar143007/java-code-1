package TwoArray;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int target = sc.nextInt();

        int arr[][] = new int[n][m];

        // input array elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // search target
        boolean found = false;
        for (int i = 0; i < n && !found; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == target) {
                    found = true;
                    break;
                }
            }
        }

        // print result
        System.out.println("search result : " + found);

        sc.close();
    }
}

