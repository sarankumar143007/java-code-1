package Triangle;

import java.util.Scanner;  // <-- Added this import

public class Left_Angle {
    public static void main(String[] args) {
        int n, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            // Print spaces first (to push stars to right)
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Then print stars
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
